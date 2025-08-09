package Interview_Programs.converts;

import java.util.ArrayList;

public class ListToArray {
    public static void main(String[] args) {
        ArrayList<String> balls = new ArrayList<>();

        balls.add("baseball");
        balls.add("volleyball");
        balls.add("radiumball");

        //using java8
     String[] arr = balls.stream().toArray(String[]::new);
       for(String s:arr){
        System.out.println(s);
        }
    }}

