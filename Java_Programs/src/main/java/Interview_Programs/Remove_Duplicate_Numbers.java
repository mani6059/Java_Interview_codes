package Interview_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicate_Numbers {
    public static void main(String[] args) {
        List<Integer> nums =Arrays.asList(1,2,34,4,65,6,5,7,5,6);
        List<Integer> unique = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
    }
}
