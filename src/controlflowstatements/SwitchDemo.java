package controlflowstatements;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        //int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("No choice");
        }
    }
}
