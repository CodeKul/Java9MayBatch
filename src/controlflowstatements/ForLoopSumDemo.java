package controlflowstatements;

import java.util.Scanner;

public class ForLoopSumDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
       //    sum = sum + i;
            sum += i;
        }

        System.out.println("Sum " + sum);
    }
}
