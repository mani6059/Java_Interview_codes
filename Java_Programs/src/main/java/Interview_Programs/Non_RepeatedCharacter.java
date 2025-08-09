package Interview_Programs;

public class Non_RepeatedCharacter {
    public static void main(String[] args) {
        String k = "MathsM";
        for(char s:k.toCharArray()){
            if(k.indexOf(s)==k.lastIndexOf(s)){
                System.out.println(s);
            break;
            }
        }

    }
}
