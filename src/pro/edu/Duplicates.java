package pro.edu;
/*
  @author   george
  @project   exercises
  @class  Duplicates
  @version  1.0.0 
  @since 14.03.2021 - 15.46
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {
     public  static  boolean hasDuplicates(int[] array){
         List<Integer> list = Arrays.stream(array).boxed().distinct().collect(Collectors.toList());
         return  list.size()!= array.length;
     }
    public  static  boolean hasDuplicatesViaSet(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length ; i++) {
            if (set.add(array[i]) == false) return true;
        }
        return  false;
    }
    public static void main(String[] args) {
         int[] array = {1,5,3,6,2,9,33,21};
        System.out.println(hasDuplicates(array));
        array[7] = 1;
        System.out.println(hasDuplicates(array));



    }
}
