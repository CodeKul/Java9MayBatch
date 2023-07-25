package arrays;

public class ArraySumDemo {
    public static void main(String[] args) {
        int array[] = {5,4,6,3,8,9,1,7,2,4};
        int result = 0;
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
            result = result + array[i];
        }
        System.out.println("Sum: "+result);
//        for (int n : array) {
//            System.out.println(n);
//        }
    }
}
