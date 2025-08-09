package Interview_Programs;

public class Star_Patterns {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            for (int j=5-i; j>0; j--) {
                System.out.println(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.println("* ");
            }
            System.out.println();
                    }
    }
}
