package statickeyword;

public class StaticBlockDemo {
    int x;
    static int cnt;
    public static void main(String[] args) {
        cnt = 0;
       // x = 0; //not allowed
        System.out.println("in main method");
    }

    static {
        cnt = 0;
        // x = 0; //not allowed
        System.out.println("in static block");
    }

   void display(){
        x = 0;
        cnt = 0;
    }
}
