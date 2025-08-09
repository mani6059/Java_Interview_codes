package Interview_Programs.Functional_Interface;

interface Func{
    public int twoNum(int h);
}
public class Square {
    public static void main(String[] args) {
        Func sqr = h -> h*h;
        System.out.println("squar num : "+sqr.twoNum(55));
    }
}
