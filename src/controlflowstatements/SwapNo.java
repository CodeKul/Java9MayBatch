package controlflowstatements;

public class SwapNo {
    public static void main(String[] args) {
        int a= 10;
        int b=20;
        System.out.println("Before swapping a= "+a +" b="+b);
        int temp;
        temp = a;  //10
        a = b ;   //20
        b = temp; //10
        System.out.println("After swapping a= "+a +" b="+b);

        //without using third variable
        int x = 10;
        int y=20;
        System.out.println("Before swapping x= "+x +" y="+y);
        x = x + y;  //30

        y = x - y; ///10

        x = x - y;  //20
        System.out.println("After swapping x= "+x +" y="+y);
    }
}
