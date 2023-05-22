package controlflowstatements;

import java.util.Scanner;
//
public class WeekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any week days");
        String weekday = sc.next();

        switch (weekday){
            case "MON":
                System.out.println("Today is Monday");
                break;

            case "TUES":
                System.out.println("Today is Tuesday");
                break;

            case "WED":
                System.out.println("Today is Wednesday");
                break;

            case "THU":
                System.out.println("Today is Thursday");
                break;

            case "FRI":
                System.out.println("Today is Friday");
                break;

            case "SAT":
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Wrong choice");
        }
    }
}
