package pro.edu;
/*
  @author   george
  @project   exercises
  @class  Flip
  @version  1.0.0 
  @since 05.11.2011 - 16.14
*/

public class Flip {

    public static int[] flip(int[] array){
        int buffer = array[0];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 ){
                buffer = array[i];
                array[i] = array[i + 1];
            }else{
                array[i] = buffer;
            }
        }
        return array;
    }

    public static void main(String[] args) {
         // odd and eager indexes inter-change the values - flip
        // 10 20 30 40 50 60 -> 20 10 40 30 60 50
        // 10 20 -> 20 10     30 40 -> 40 30   50 60 -> 60 50
        int[] array = {10, 20, 30, 40, 50, 60};

        for (int i = 0; i < array.length ; i++) {
            System.out.print( " " + array[i]);
        }
        System.out.println();
        array = flip(array);
        for (int i = 0; i < array.length ; i++) {
            System.out.print( " " + array[i]);
        }


    }
}
