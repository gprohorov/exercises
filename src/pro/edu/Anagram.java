package pro.edu;
/*
  @author   george
  @project   exercises
  @class  Abagram
  @version  1.0.0 
  @since 23.05.2021 - 16.53
*/

import java.util.Arrays;
import java.util.Objects;

public class Anagram {
    public static void main(String[] args) {
        String w1 = "restful";
        String w2 = "fluster";

        char[] chars1 = w1.toCharArray();
        Arrays.sort(chars1);
        w1 = new String(chars1);

        char[] chars2 = w2.toCharArray();
        Arrays.sort(chars2);
        w2 = new String(chars2);
        final String reduce = Arrays.asList(chars2).stream().map(el -> String.valueOf(el))
                .reduce("", (temp,el) -> temp + el);
        System.out.println("-------------");
        System.out.println(reduce);

        System.out.println(w1.equals(w2));
        System.out.println(chars1.equals(chars2));

    }
}
