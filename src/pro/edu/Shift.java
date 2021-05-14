package pro.edu;
/*
  @author   george
  @project   exercises
  @class  Shift
  @version  1.0.0 
  @since 05.03.2021 - 15.44
*/

import java.util.Arrays;

public class Shift {

    public static int[] leftShift(int[] array){
        int buffer = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (i != array.length - 1 ){
                array[i] = array[ i + 1 ];
            } else{
                array[i] = buffer;
            }
        }
        return array;
    }

    public static int[] rightShift(int[] array){
        int buffer = array[array.length-1];
        for (int i = array.length -1; i >= 0 ; i--) {
            if (i != 0 ){
                array[i] = array[ i - 1 ];
            } else{
                array[i] = buffer;
            }
        }
        return array;
    }

    public static int[] leftShift(int[] array, int step){
        int[] arrRes = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int index = (i + step) % array.length;
            arrRes[i] = array[index];
        }
        return arrRes;
    }

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        // ->  20  30  40  50  10   left shift
        array = leftShift(array);

        for (int i = 0; i < array.length ; i++) {
            System.out.print( " " + array[i]);
        }
        System.out.println();
        array = rightShift(array);
        for (int i = 0; i < array.length ; i++) {
            System.out.print( " " + array[i]);
        }
        System.out.println();
        array = leftShift(array, 2);
        for (int i = 0; i < array.length ; i++) {
            System.out.print( " " + array[i]);
        }
        System.out.println();

        int[] array2 = {10, 20, 30, 40, 50};
        array = leftShift(array2, 21);
        for (int i = 0; i < array.length ; i++) {
            System.out.print( " " + array[i]);
        }

    }
}
