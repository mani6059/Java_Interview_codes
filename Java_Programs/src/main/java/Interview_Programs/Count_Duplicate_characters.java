package Interview_Programs;

import java.util.Map;
import java.util.stream.Collectors;

public class Count_Duplicate_characters {
    public static void main(String[] args) {
        String s = "afsgsgrga";


        Map<Character,Long> count = s.chars()
                                    .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));

        count.forEach((k,v)->{
            if(v>1){
                System.out.println(k+" : "+v);
            }
        });
    }
}
