package pro.edu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutations {

    public static Set<String>  permute(String str){

         String[] split = str.split("");
         Set<String> set = new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j < str.length(); j++) {
                String buf = split[i];
                split[i] = split[j];
                split[j] = buf;
                String newOne = Arrays.stream(split).sequential().reduce("", String::concat);
                set.add(newOne);

            }
        }

        return set;
    }

    public static void main(String[] args) {
        String test = "012";
        System.out.println(permute(test));
        StringBuilder sb;

    }
}
