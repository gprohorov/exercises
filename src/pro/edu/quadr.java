package pro.edu;
/*
  @author   george
  @project   exercises
  @class  quadr
  @version  1.0.0 
  @since 02.04.2021 - 08.43
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class quadr {
     public static int solution(int a, int b, int c){

         int d = b*b - 4 * a * c;

         if (d> 0) return 2;
         if (d< 0) return 0;

         return 1;
     }
    public static void main(String[] args) {
        System.out.println(solution(1, 5, 6));

        int a = Integer.MIN_VALUE;
        int b = -a;
        System.out.println(a +  " " + b) ;

        String str = "12345";
        str.substring(0,2);
        System.out.println(str);
        String s = "blooper";
        StringBuilder sb = new StringBuilder(s);

        System.out.println(sb.append(s.substring(4)));


    }
}
