package controlflowstatements;

import java.util.Scanner;

public class ForLoopReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no");
        int no = sc.nextInt(); //10
        for (int i = no; i > 0; i--) {
            System.out.println(i);
        }
    }
}
