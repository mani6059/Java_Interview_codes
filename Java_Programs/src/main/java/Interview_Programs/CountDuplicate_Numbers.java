package Interview_Programs;

import java.util.*;

public class CountDuplicate_Numbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 7, 2, 6, 1, 6);

        //count duplicate numbers, can use Function.identity() instead of j->j
       /* Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(j -> j, Collectors.counting()));
        System.out.println(map);*/

        //count duplicate numbers using Collections.frequency()
        Set<Integer> ds = new HashSet<>(list);
        for(Integer r :ds){
            System.out.println(r+":"+Collections.frequency(list,r));
        }
    }}
