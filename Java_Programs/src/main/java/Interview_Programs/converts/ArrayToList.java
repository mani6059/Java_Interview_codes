package Interview_Programs.converts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {
    public static void main(String[] args) {
            /*Integer num[] = {1,24,5,678,8};
        List<Integer> list = Arrays.asList(num);
        System.out.println(list);*/

        //java8
        Integer i[] = {1,2,3,5,6};
        List<Integer> lj  = Arrays.stream(i).collect(Collectors.toList());
        System.out.println(lj);
    }
}

