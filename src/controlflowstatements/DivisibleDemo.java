package controlflowstatements;

import java.util.Scanner;

public class DivisibleDemo {
    public static void main(String[] args) {
        int n = 15;
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n + " is divisible by both");
        } else if (n % 3 == 0) {
            System.out.println(n + " is divisible by 3 only");
        } else if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5 only");
        }
    }
}
