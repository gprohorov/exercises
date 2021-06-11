package pro.edu.trash;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Trash {

    static class Super{
        public int getNumber(int a){
            return  a;
        }
    }
    static class SubClass extends  Super{
            public int getNumber(int a, int b){
                return  a;
        }
    }



    public static void main(String[] args) {
        SubClass sc = new SubClass();
        System.out.println(sc.getNumber(4));


        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("12");
        list.add("13");
        list.add("14");
        list.add("11");

        System.out.println(list.remove("9"));

        IntStream ints = IntStream.empty();
        IntStream moreints = IntStream.of(66,77,88);
        Stream.of(ints,moreints).flatMapToInt(x->x).forEach(System.out::print);
    //  --------------------   FLATMAPTOINT  ---------------------

        Stream<Character> stream = Stream.of('a','m');
        stream.map(x->x).collect(Collectors.toList());

        byte b = -128;
        int i = b;
        b = (byte) i;

        System.out.println(b + "   " + i);


    }
}
