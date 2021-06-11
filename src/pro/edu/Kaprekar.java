package pro.edu;
/*
  @author   george
  @project   exercises
  @class  Kaprekar
  @version  1.0.0 
  @since 09.09.2021 - 15.12
*/

import java.util.Arrays;

public class Kaprekar {
    public static String reverseString(String string){
        String reversed = "";
        for (int i = 0; i <string.length() ; i++) {
            reversed += string.charAt(string.length() - 1 - i);
        }
        StringBuilder sb = new StringBuilder(string);
        String rvrsd = sb.reverse().toString();
        return reversed;
    }

    public static int toAsc(int num){

        String string = String.valueOf(num);
        char[] array = string.toCharArray();
        Arrays.sort(array);
        String sortedString = new String(array);
        return Integer.valueOf(sortedString);
    }

    public static int toDesc(int num){

        String string = String.valueOf(num);
        char[] array = new char[string.length()];
        for (int i = 0; i < string.length() ; i++) {
            array[i] = string.charAt(i);
        }
        Arrays.sort(array);
        String sortedString = "";

        for (int i = 0; i < array.length ; i++) {
            sortedString += array[i];
        }

        return Integer.valueOf(reverseString(sortedString));
    }

    public static int kaprekar(int num){
        int step = 0;
        while(num != 6174){
            if (num < 1000) num*= 10;
            step++;
            int desc = toDesc(num);
            int asc = toAsc(num);
            num = desc - asc;
        }
        return step;
    }
    public static void main(String[] args) {

        System.out.println(kaprekar(3524)); //3
        System.out.println(kaprekar(495)); //4
        System.out.println(kaprekar(10)); //5
        System.out.println(kaprekar(6621)); //5
        System.out.println(kaprekar(6554)); //4
        System.out.println(kaprekar(1234)); //3

    }
}
