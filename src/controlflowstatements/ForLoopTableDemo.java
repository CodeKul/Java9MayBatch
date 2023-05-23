package controlflowstatements;

import java.util.Scanner;

public class ForLoopTableDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no");
        int no = sc.nextInt(); // 5   5*1 =5 5*2=10
        int result = 0;
        for (int i = 1; i < 11; i++) {
            result = no * i;
            System.out.println(no + "*" + i + "=" + result);
        }
    }
}
