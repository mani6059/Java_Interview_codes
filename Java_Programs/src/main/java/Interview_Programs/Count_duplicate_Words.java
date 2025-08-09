package Interview_Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_duplicate_Words {
    public static void main(String[] args) {


      /*  List<String> words = Arrays.asList("siri", "Brand", "mani", "siri", "Chocolate");
        Map<String, Long> map = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);*/

        /*integer and string generics */
        Map<Integer, String> dupString = new HashMap<>();
        dupString.put(1,"blue");
        dupString.put(2,"green");
        dupString.put(3,"yellow");
        dupString.put(4,"green");

        Map<String,Long> stringCount = dupString.values().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        stringCount.forEach((color, count)->
                System.out.println(color+" "+count));
    }

}
