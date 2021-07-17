package pro.edu.mlthrd.threethrds;/*
  @author   george
  @project   exercises
  @class  Trash
  @version  1.0.0 
  @since 28.06.21 - 05.44
*/

import java.util.Scanner;

public class Trash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(true) {

            int in = sc.nextInt();
            if (in % 11 == 0 ) {
                count ++;
            }else {
                break;
            }
            if (in % 3 == 0) sum+=in;
        }
        System.out.println(count);
        System.out.println(sum
        );
    }
}
