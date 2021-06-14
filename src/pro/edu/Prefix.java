package pro.edu;
/*
  @author   george
  @project   exercises
  @class  Prefix
  @version  1.0.0 
  @since 15.03.2012 - 16.43
*/

import java.util.Arrays;
import java.util.Comparator;

public class Prefix {
/*

    public static String prefix(String[] array) {
        String prefix = array[0];
        for (int i = 1; i < array.length; i++) {
            while (array[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
*/

    public static String prefix(String[] array) {

        String longestPrefix = "";
        if (array.length > 0) {
            longestPrefix = array[0];
        }
        for (int i = 1; i < array.length; i++) {
            String analyzing = array[i];
            int j = 0;
            for (; j < Math.min(longestPrefix.length(), array[i].length()); j++) {
                if (longestPrefix.charAt(j) != analyzing.charAt(j)) {
                    break;
                }
            }
            longestPrefix = array[i].substring(0, j);
        }
        return longestPrefix;
    }

    public static void main(String[] args) {
     String[] array = {"abcde", "abcd", "abce", "abccac", "abcac"} ;

        System.out.println(prefix(array));
    }
}
