package exceptionhandling;

public class IndexOutExDemo {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {

            arr[0] = 5;
            arr[1] = 4;
            arr[2] = 6;
            arr[5] = 7;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println(arr);
        System.out.println("Remaining code");
    }
}
