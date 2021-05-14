package pro.edu;
/*
  @author   george
  @project   exercises
  @class  Sum10
  @version  1.0.0 
  @since 14.05.2021 - 10.57
*/

import java.util.Arrays;

public class Sum10 {
  public static int[] getPair(int[] array, int target){
      int[] output = new int[2];
      for (int i = 0; i < array.length ; i++) {
          for (int j = 0; j < array.length; j++) {
              if( array[i] + array[j] == target  && i!=j){
                  output[0] = array[i];
                  output[1] = array[j];
                  return output;
              }
          }
      }

    return  output;
  }
    public static void main(String[] args) {

      int[] array = {1, 4 , 3, 11 ,  5, 6, 87 };
        System.out.println(Arrays.toString(getPair(array, 10)));

    }
}
