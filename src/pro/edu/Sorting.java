package pro.edu;
/*
  @author   george
  @project   exercises
  @class  Sorting
  @version  1.0.0 
  @since 13.03.2021 - 22.32
*/

public class Sorting {


    //   2 fori
    public  static int[] byBubbleAsc(int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length - 1 - i ; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
        return  array;
    }
    // while NOT sorted
    public  static int[] byBubbleAscWhile(int[] array){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for (int i = 0; i < array.length -1; i++) {
                if (array[i] > array[i + 1 ]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }


        return  array;
    }


    public  static int[] byBubbleDesc(int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length - 1 - i ; j++) {
                if (array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
        return  array;
    }

    public static void main(String[] args) {
        int[] array = {6,32, 71,4, 11, 1};
        array = byBubbleDesc(array);
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
        System.out.println("--------- while ------------");
        int[] array2 = {16,2, 11,4, 21, 1};
        array2 = byBubbleDesc(array2);
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array2[i]);
        }


    }

}
