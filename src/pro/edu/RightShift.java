package pro.edu;
/*
  @author   george
  @project   exercises
  @class  RightShift
  @version  1.0.0 
  @since 16.04.2021 - 15.42
*/

import java.util.Arrays;

public class RightShift {
    public static int[] rightShift(int[] array, int step){
        for(int i = 0; i < step; i++){
            int j, last;
            last = array[array.length-1];

            for(j = array.length-1; j > 0; j--){
                array[j] = array[j-1];
            }
            array[0] = last;
        }
        return array;

    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        int[] array3 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array3, 21))); // [50, 10, 20, 30, 40]
    }
}
