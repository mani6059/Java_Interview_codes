package Interview_Programs;

import java.util.stream.IntStream;

public class Index_Range_Numbers {
    public static void main(String[] args) {
        int[] nums = {1,5,6,2,4,1};
//find the range of index
        IntStream.range(2,5)
                .mapToObj(i->nums[i]) //maps each index i to the corresponding element in the nums array.
                .forEach(System.out::println);
    }
}
