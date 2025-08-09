package Interview_Programs.converts;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToMap {
    public static void main(String[] args) {
        /*String_Example arrays[] = {"biryani","Icecream","Sweet","sprite"};
Integer num[] = {1,2,4,5,7,8};

Map<Integer, String_Example> map =new HashMap<>();
for(int i=0; i< arrays.length;i++){
    map.put(num[i],arrays[i]);
}
        System.out.println(map);
    }*/
        //java8, this will give word length as well
String [] arr = {"as","re","lab","treat"};
Map<String,Integer> mko = Arrays.stream(arr).collect(Collectors.toMap(a->a, String::length));
        System.out.println(mko);


        Integer[] intArray = {1, 2, 3, 4, 5};
        Map<Integer, Integer> intMap = Arrays.stream(intArray).collect(Collectors.toMap(i -> i, i -> i));
        System.out.println(intMap);
    }}


