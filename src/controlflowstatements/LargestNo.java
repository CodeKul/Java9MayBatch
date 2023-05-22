package controlflowstatements;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int n1 = sc.nextInt();
        System.out.println("Enter second no");
        int n2 = sc.nextInt();
        System.out.println("Enter third no");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3)
            System.out.println(n1 + " is a Largest no");

        else
            if (n2>n1 && n2 > n3)
                System.out.println(n2 + " is a Largest no");
            else
                System.out.println(n3 + " is a Largest no");
    }
}
