package pro.edu;/*
  @author   george
  @project   exercises
  @class  pro.edu.AnagramGroup
  @version  1.0.0 
  @since 13.05.2021 - 22.34
*/

import java.util.*;
import java.util.stream.Collectors;

public class AnagramGroup {

    public static List<List<String>> anagrams(String[] input){
        List<List<String>> output = new ArrayList<>();
        Map<String, HashSet<String>> map = new HashMap<>();
        StringBuilder sb;
        for(String str: input){
            String key = str;
            String[] array =  str.split("");
            HashSet<String> set = new HashSet<String>(Arrays.asList(array));
            map.put(key, set);
        }
        final ArrayList<HashSet<String>> values = new ArrayList<>(map.values());

        final List<HashSet<String>> valuesSet = values.stream().distinct().collect(Collectors.toList());

        for (int i = 0; i < valuesSet.size()  ; i++) {
            output.add(new ArrayList<String>());
        }

        for (int i = 0; i < valuesSet.size()  ; i++) {
            for( Map.Entry<String, HashSet<String>>  entry : map.entrySet()){
                if (valuesSet.get(i).equals(entry.getValue())){
                    output.get(i).add(entry.getKey());
                }
            }
        }


        return output;
    }
    public static List<List<String>> anagrams2(String[] input){
        List<List<String>> output = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        StringJoiner joiner;
        for(String str: input){
            String key = str;
            byte[] array =  str.getBytes();
            Arrays.sort(array);
            String value = new String(array);

            map.put(key, value);
        }
        final ArrayList<String> values = new ArrayList<>(map.values());

        final List<String> valuesSet = values.stream().distinct().collect(Collectors.toList());

        for (int i = 0; i < valuesSet.size()  ; i++) {
            output.add(new ArrayList<String>());
        }

        for (int i = 0; i < valuesSet.size()  ; i++) {
            for( Map.Entry<String, String>  entry : map.entrySet()){
                if (valuesSet.get(i).equals(entry.getValue())){
                    output.get(i).add(entry.getKey());
                }
            }
        }


        return output;
    }

    public static void main(String[] args) {
        String[] array =  {"cab", "cz", "abc", "bca", "zc"};

        System.out.println(anagrams2(array));
    }
}
