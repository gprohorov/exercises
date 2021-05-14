/*
  @author   george
  @project   exercises
  @class  deleteDuplicates
  @version  1.0.0 
  @since 14.05.2021 - 09.49
*/

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeleteDuplicates {

    public static void main(String[] args) {
        List<Integer> list = Stream.of( 0,1,6 ,4,2,1,8).collect(Collectors.toList());
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        list = set.stream().collect(Collectors.toList());
        System.out.println(list);
    }
}
