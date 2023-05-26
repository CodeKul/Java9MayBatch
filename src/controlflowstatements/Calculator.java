package controlflowstatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter any two nos");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter any choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Addition : " + (x + y));
                    break;
                case 2:
                    System.out.println("Subtraction : " + (x - y));
                    break;
                case 3:
                    System.out.println("Multiplication : " + (x * y));
                    break;
                case 4:
                    System.out.println("Division : " + (x / y));
                    break;
                case 5:
                    System.exit(0);
            }
        } while (ch <= 5);

    }
}
