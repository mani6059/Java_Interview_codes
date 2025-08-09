package Interview_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_Array_Strings {
    public static void main(String[] args) {
        String[] dc = {"RR","TT","YY"};
        List<String> list = Arrays.asList(dc);
        Collections.reverse(list);
        String[] reversed = list.toArray(new String[0]);

        System.out.println(Arrays.toString(reversed));
    }
}
