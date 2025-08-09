package Interview_Programs;

import java.util.Arrays;
import java.util.List;

public class Find_Smallest_Number {
    public static void main(String[] args) {
        List<Integer> small = Arrays.asList(0,5,-7,8);
        int smallest = small.stream().min(Integer::compare).get();
        System.out.println(smallest);
    }
}
