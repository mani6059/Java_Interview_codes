package Interview_Programs;

public class Reverse_Number {
    public static void main(String[] args) {

        //normal java
      int num = 1456;
      int reverse = 0;
  while(num!=0){
    int remainder = num%10;
    reverse=reverse*10+remainder;
    num=num/10;
}
        System.out.println(reverse);
    }
        //using java8

      /*  int reversedNumber = IntStream.iterate(num, i -> i > 0, i -> i / 10)
                .map(i -> i % 10)
                .reduce(0, (a, b) -> a * 10 + b);
        System.out.println("Reversed number: " + reversedNumber);
}*/
}
