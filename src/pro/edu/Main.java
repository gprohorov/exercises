package pro.edu;

import java.util.stream.Stream;

/*
@author   george
@project   exercises
@class  palindrom
@version  1.0.0
@since 04.04.2011
 */
public class Main {
    class Test2{
        int a;
        int b = 0;
        public void m(){
            int d;
            int e = 0;
            e++;
        }
    }

    public static void main(String[] args) {


        System.out.println(" Hello, exercises!");
        final Demos.Seasons winter = Demos.Seasons.WINTER;
        Stream.of(1,3,1,6,2,0,9).sorted()
                .findAny().ifPresent(System.out::println);

    }
}
