package Interview_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicates_Characters {
    public static void main(String[] args) {
        List<Character> jet = Arrays.asList('k','k','l');
        jet = jet.stream().distinct().collect(Collectors.toList());
        System.out.println(jet);
    }
}
