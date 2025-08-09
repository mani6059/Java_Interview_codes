package Interview_Programs.Functional_Interface;

 interface FunctionalInterface_Lambda {
    public void m1(int i,int j);}

    class Test{
    public static void main(String[] args) {
        FunctionalInterface_Lambda fi = (i,j)->System.out.println("functional interface addition "+(i+j));
          fi.m1(2,6);
    }
}
