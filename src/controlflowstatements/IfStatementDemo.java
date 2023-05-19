package controlflowstatements;

public class IfStatementDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        //Simple if
        if (x < y)
            System.out.println("Y is greater");

        //if--else statement

        if (x>y)
            System.out.println("X is greater");
        else
            System.out.println("Y is greater");

        //if-else-if ladder
        String city = "Mumbai1";
        if (city.equals("Pune"))
            System.out.println("You are in Pune");
        else
            if (city.equals("Mumbai"))
                System.out.println("You are in Mumbai");
            else
                System.out.println("You are in Nagpur");



        // Nested if
        String state = "Maharashtra";
        if (state.equals("Maharashtra")){
            if (city.equals("Pune")) {
                System.out.println("You are from Maharashtra");
            }
        }else {
            System.out.println("You are from UP");
        }
    }
}
