package controlflowstatements;

/**
 * There are 4 types of if statements
 * 1. Simple if
 * 2. if-else stmt
 * 3. if-else-if ladder
 * 4. Nested if
 *
 * *** Switch Statement -
 * switch(expr) //int,short,byte,char,String - java 7{
 * case 1: // cases can not be duplicate
 * stmts;
 * break;// terminates switch block
 * case 2:
 * stmts;
 * break;
 * .
 * .
 * .
 * .case 10;
 * default: // optional
 * stmts
 * }
 */
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
