package Interview_Programs.converts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapToArray {
    public static void main(String[] args) {

Map<String,String> map = new HashMap<>();
map.put("Red","fruit");
map.put("BLUE","ball");

/*        //convert k,v
Object[] objArray = map.entrySet().toArray();
        System.out.println(Arrays.toString(objArray));

        //convert keys
        String_Example[] key = map.keySet().toArray(new String_Example[0]);
        System.out.println(Arrays.toString(key));
    }*/
        //java8
        String[] op = map.entrySet().stream()
                .map(entry->entry.getKey()+"="+entry.getValue())
                .toArray(String[]::new);
        Arrays.stream(op).forEach(System.out::println);
}}