package Interview_Programs;

public class First_Non_Repeated_Character {
    public static void main(String[] args) {
       "Hyderabad".chars().mapToObj(c->Character.valueOf((char)c))
               .findFirst()
               .ifPresent(System.out::println);
    }
}
