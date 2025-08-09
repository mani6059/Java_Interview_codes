package Interview_Programs;

import java.util.Arrays;
import java.util.List;

public class Find_Largest_Number {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,8,1,7);

       int large =  list.stream().max(Integer::compare).get();
        System.out.println(large);
    }
}
