package Interview_Programs;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean match =Arrays.equals(c1,c2);
        if(match){
            System.out.println("Anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}
