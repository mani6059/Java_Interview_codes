package Interview_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_Duplicate_Numbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,4,4,3,8,8);
    //find duplicates
        Set<Integer> result = new HashSet<>();
        list.stream().filter(n -> !result.add(n)).collect(Collectors.toSet()).forEach(System.out::println);

}}
