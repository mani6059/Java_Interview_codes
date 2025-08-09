package Interview_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicate_StringORwords {
    public static void main(String[] args) {
        String sr = "The first second was alright but the second second was tough";
        sr = Arrays.stream(sr.split("\\s+")).distinct().collect(Collectors.joining(" "));
        System.out.println(sr);

        //duplicate words remove
     /*   List<String_Example> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana");
List<String_Example> dup = strings.stream().distinct().collect(Collectors.toList());
        System.out.println(dup);*/

        String words = "Sam Sam is left";
        String[] dup = words.split(" ");
        List<String> list = Arrays.stream(dup).distinct().collect(Collectors.toList());
        System.out.println(list);

    }
}
