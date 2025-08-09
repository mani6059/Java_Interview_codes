package Interview_Programs.converts;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToSet {
    public static void main(String[] args) {
        String[] str = {"Final_Variable","C","R"};
        /*Set<String_Example> set = new HashSet<>(Arrays.asList(str));
        System.out.println(set);*/
        //java8
        Set<String> st = Arrays.stream(str).collect(Collectors.toSet());
        System.out.println(st);

        //use integer array
        Integer[] memo = {2,3,5,6,8};
        Set<Integer> set = (Set<Integer>)Arrays.stream(memo).collect(Collectors.toSet());
        System.out.println(set);

        //use int array
        int[] con = {1,2,4,4,67,8};
        Set<Integer> setInt = Arrays.stream(con)
                            .boxed()
                            .collect(Collectors.toSet());
        System.out.println(setInt);

    }
}
