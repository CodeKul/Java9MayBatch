package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionPropagateDemo2 {
    void m1() throws FileNotFoundException,ArithmeticException {
        PrintWriter pw = new PrintWriter("");
        System.out.println(10/0);
    }

    void m2() throws FileNotFoundException{
        m1();
    }

    void m3() throws FileNotFoundException{
        m2();
    }
}

class ExceptionPropagateDemo2Impl{
    public static void main(String[] args)  {
        ExceptionPropagateDemo2 demo2 = new ExceptionPropagateDemo2();
       try {
           demo2.m3();
       }catch (FileNotFoundException|ArithmeticException e){
           System.out.println(e.getMessage());
       }
        System.out.println("Remaining code");
    }
}