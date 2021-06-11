package pro.edu;

import java.util.ArrayList;
import java.util.List;

public class Brilliant {
    public static boolean isBrilliant(int num){


        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < num ; i++) {
            if (num % i ==0) list.add(i);
            if ( i * i == num) return true;
        }

        if (list.size() ==2){
            String i1 = String.valueOf(list.get(0));
            String i2 = String.valueOf(list.get(1));
            if (i1.length() == i2.length()) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isBrilliant(11));


    }

}
