package pro.edu;
/*
  @author   george
  @project   exercises
  @class  Sup
  @version  1.0.0 
  @since 02.04.2021 - 10.56
*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sup {
   public static String sum(double a){
       return " Double";
   }

   public static String sum(float a){
       return " Float";
   }

    public static void main(String[] args) {

        System.out.println(sum(2.0f));

        List<Integer> list = Stream.of(1,1,1,1).collect(Collectors.toList());

    }
}
