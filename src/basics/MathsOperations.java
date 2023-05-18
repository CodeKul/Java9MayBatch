package basics;

public class MathsOperations {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println("X : "+x );
        System.out.println("Y : "+y );
        System.out.println("msg "+args[2]);
        int result = 0;
        result = x + y;
        System.out.println("Addition = " + result);
        result = x - y;
        System.out.println("Subtraction = " + result);
        result = x * y;
        System.out.println("Multiplication = " + result);
        result = x / y;
        System.out.println("Division = " + result);
        result = x % y;
        System.out.println("Mod = " + result);
    }
}
