package Interview_Programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class Combine_Strings_2_Arrays {
    public static void main(String[] args) {

        String[] a1 = {"er","jym","aipo"};
        String[] a2 = {"erg","xccgz","posdj"};

      /*  int a3 = a1.length+a2.length;
        String[] combine = new String[a3];

        for(int i=0;i<a1.length;i++){
            combine[i]=a1[i];
        }
        for(int i=0;i<a2.length;i++){
            combine[a1.length+i]=a2[i];
        }
        for(String k:combine){
            System.out.println(k+"");
        }*/


        //java8
        String[] ne = Stream.concat(Arrays.stream(a1),Arrays.stream(a2))
                .toArray(String[]::new);//collects the elements of the combined stream into a new string array.
        for(String str : ne){
            System.out.println(str+" ");
        }

        //ascending
        String[] asc = Stream.concat(Arrays.stream(a1),Arrays.stream(a2))
                .sorted()
                .toArray(String[]::new);
        System.out.println(asc + "Ascending strings");

        //descending
        String[] desc = Stream.concat(Arrays.stream(a1),Arrays.stream(a2))
                .sorted((ss1,ss2)->ss2.compareTo(ss1))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(desc)+" descending order");
    }
}
