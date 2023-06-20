package oops;

public class OddEvenNo {
    static int addition(int n1, int n2) {
        return n1 + n2;
    }

   public void checkOddEven(int no) {
        if (no % 2 == 0)
            System.out.println("Given no is even");
        else
            System.out.println("Given no is odd");

    }
}

class MethodDemo {
    public static void main(String[] args) {
        OddEvenNo oddEvenNo = new OddEvenNo();
        oddEvenNo.checkOddEven(5);

        int total = OddEvenNo.addition(5, 10);
        System.out.println("Total " + total);
    }
}