package pro.edu;

import java.util.Arrays;

public class NumAsc {
 public static int sortCiphers(int num){
     String str = String.valueOf(num);
     char[] array = str.toCharArray();
     Arrays.sort(array);
     String sortedString = new String(array);
     int out = Integer.valueOf(sortedString);


     return out;
 }

    public static void main(String[] args) {
        System.out.println(sortCiphers(1743));
    }
}
