package exceptionhandling;

public class NumberFormatExDemo {
    public static void main(String[] args) {
        String n = "10abc";
        try {
            int no  = Integer.parseInt(n);
            System.out.println(no);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Remaining code");
    }
}
