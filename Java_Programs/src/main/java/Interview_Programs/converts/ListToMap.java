package Interview_Programs.converts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sweet");
        list.add("chips");
        list.add("popcorn");

        Map<String,Integer> map = list.stream()
                                    .collect(Collectors.toMap(s->s,s->s.length()));
        System.out.println(map);

    }
}
