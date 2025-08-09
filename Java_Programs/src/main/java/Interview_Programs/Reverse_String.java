package Interview_Programs;

public class Reverse_String {
    public static void main(String[] args) {
       //method1
       String word = "Horse";
       StringBuilder sb = new StringBuilder();
       sb.append(word);
       sb.reverse();
       System.out.println(sb);

        //method2
        /*char[] ch = word.toCharArray();
        for(int i=ch.length-1; i>=0; i--)
            System.out.print(ch[i]+" ");*/
    }
}
