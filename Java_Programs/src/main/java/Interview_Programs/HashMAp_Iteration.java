package Interview_Programs;

import java.util.HashMap;
import java.util.Map;

public class HashMAp_Iteration {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Bob", 35);

        // Iterate the HashMap using forEach and lambda expression
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
