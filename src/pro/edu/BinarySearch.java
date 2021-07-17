package pro.edu;
/*
  @author   george
  @project   exercises
  @class  binarySearch
  @version  1.0.0 
  @since 13.05.2021 - 20.56
*/

public class BinarySearch {

    public static int search(int[] array, int key){
        int index = -1;
        int bot = 0;
        int top = array.length -1;



        while(bot <= top){
            int middle = (top + bot)/2;
            System.out.println(middle);
            if( key < array[middle]){
                top = middle  - 1;
            } else if (key > array[middle]) {
                bot = middle +1 ;
            } else if (key == array[middle]){
                index = middle;
                break;
            }
        }
        return index;
    }


    public static void main(String[] args) {

        int[] array = {0, 10, 20, 30, 40, 50, 60, 70 , 80, 90, 100, 110};

        int  index = search(array, 100);
        System.out.println(index);

    }
}
