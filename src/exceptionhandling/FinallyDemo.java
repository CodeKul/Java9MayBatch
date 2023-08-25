package exceptionhandling;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }finally {
            System.out.println("in finally block");
        }
        System.out.println("Remaining code");
    }
}
