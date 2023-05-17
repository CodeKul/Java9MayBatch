package basics;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        //Unary Operator
        System.out.println(a++); //10
        System.out.println(a--); //11
        System.out.println(++a); //11
        System.out.println(--a); //10
        System.out.println(~a);
        boolean flag = false;
        System.out.println(!flag); // true

        //Arithmetic Operator
        System.out.println(10+15); //
        System.out.println(25-5);
        System.out.println(2*5);
        System.out.println(9/3);
        System.out.println(9 % 3); //0
        int b = 5;
        System.out.println(b<<2); // b * 2^2 = 5*4 = 20
        System.out.println(32>>3); // b / 2^3 = 32/8 = 4
        int c = 2;
        System.out.println(a<b && b >c );
        System.out.println(a<b & b >c );
        System.out.println(a<b || b >c );
        System.out.println(a<b | b >c );
        //Ternary Operators
        System.out.println(a<b ? "b is greater" : "a is greater");

        // Relational Operators
        System.out.println(a>b);
        System.out.println(a<c);
        System.out.println(a<=b);
        System.out.println(a>=b);
    }
}
