package Interview_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Print_ONLY_Duplicate_Number {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,7,9,76,3,9);

        Set<Integer> set = new HashSet<>();
        Set<Integer> dup = list.stream().sorted().filter(b->!set.add(b)).collect(Collectors.toSet());
        System.out.println(dup);
    }
}
