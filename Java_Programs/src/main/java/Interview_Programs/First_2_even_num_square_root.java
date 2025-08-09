package Interview_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class First_2_even_num_square_root {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(4);

List<Double> sq =  list.stream().filter(n->n%2==0)
                    .limit(2) // Take the first two
                    .map(Math::sqrt)
                    .collect(Collectors.toList());
        System.out.println(sq);
    }
    }
