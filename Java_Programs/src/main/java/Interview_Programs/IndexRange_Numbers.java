package Interview_Programs;

import java.util.stream.IntStream;

public class IndexRange_Numbers {
    public static void main(String[] args) {
            int[] arr = {1,2,4244,5};
        IntStream.range(2,4).mapToObj(i->arr[i]).forEach(System.out::println);
    }
}
