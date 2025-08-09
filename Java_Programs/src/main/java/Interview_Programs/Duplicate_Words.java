package Interview_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate_Words {
    public static void main(String[] args) {
        String nom ="the man is part of the human";
        List<String> sub = Arrays.asList(nom.split(" "));
        List<String> dup = sub.stream()
                .collect(Collectors.groupingBy(String::toLowerCase))
                .entrySet()
                .stream().filter(l->l.getValue().size()>1)
                .map(e->e.getKey())
                .collect(Collectors.toList());
        System.out.println("Duplicate words "+ dup);
    }
}
