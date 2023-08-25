package exceptionhandling;

import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if (age <= 60)
            throw new ArithmeticException("Not applicable for vaccine");
        else
            System.out.println("applicable for vaccine");
    }
}
