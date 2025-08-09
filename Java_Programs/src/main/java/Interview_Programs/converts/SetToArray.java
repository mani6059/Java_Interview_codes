package Interview_Programs.converts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetToArray {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Final_Variable");
        set.add("B");
        set.add("C");
/*
        String_Example[] srr = new String_Example[set.size()];
        set.toArray(srr);//convert
        System.out.println(Arrays.toString(srr));*/

        //java8 stream
        String[] convert = set.stream().toArray(String[]::new);
        Arrays.stream(convert).forEach(System.out::println);
    }
}
