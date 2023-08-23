package exceptionhandling;

public class ArithmeticExDemo {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println(5 / 0);
            System.out.println("6");
            System.out.println("7");
            System.out.println("8");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Remaining code");
    }
}
