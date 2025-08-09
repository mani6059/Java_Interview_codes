package Interview_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseNumber_OR_Descending_Order {
    public static void main(String[] args) {
        List<Integer> lm = Arrays.asList(1,5,8,9,7);
        lm.stream().sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }


}
