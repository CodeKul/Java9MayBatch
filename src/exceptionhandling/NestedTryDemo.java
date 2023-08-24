package exceptionhandling;

public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10/0);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Remaining code1");
            String str = null;
            System.out.println(str.toUpperCase());

        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Remaining code2");
    }
}
