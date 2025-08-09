package Interview_Programs;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Combine_Numbers_2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 48, 9};
        int[] arr2 = {6, 2, 44, 532, 1};

        /*int[] combinedArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            combinedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinedArray[arr1.length + i] = arr2[i];
        }

        for (int i : combinedArray) {
            System.out.print(i + " ");
        }*/

        // java8
        int[] unSort = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).toArray();
        for (int combine : unSort) {
            System.out.println("combine int values: " + combine);
        }

        //ascending order
        int[] combinedArray = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sorted().toArray();
        for (int num : combinedArray) {
            System.out.print(num + " ");
        }

        //descending
        int[] combined = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2))
                .boxed()//converts the IntStream to a Stream<Integer> so that we can use sorted() with a custom comparator.
                .sorted((j, k) -> k - j)
                .mapToInt(Integer::intValue)//converts the stream back to an int array
                .toArray();
        for (int desc : combined) {
            System.out.print(desc + " ");
        }
    }
}



