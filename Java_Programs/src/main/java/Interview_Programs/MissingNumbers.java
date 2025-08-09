package Interview_Programs;

public class MissingNumbers {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,5};

        int n = arr.length+1;
        int num = (n*(n+1))/2;

        for(int i=0; i<arr.length; i++){
            num = num-arr[i];
        }
        System.out.println("Missing number: "+num);
    }
}
