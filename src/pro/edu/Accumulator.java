package pro.edu;

import java.util.Arrays;

public class Accumulator {
    public static String acum(int[] array){
        for (int i = 1; i < array.length ; i++) {
            array[i] = array[i] + array[i-1];
        }
        return Arrays.toString(array);
    }
    public static void main(String[] args) {
        int[] array = {0,1, 2, 3,4};

        System.out.println(acum(array));

    }

}
