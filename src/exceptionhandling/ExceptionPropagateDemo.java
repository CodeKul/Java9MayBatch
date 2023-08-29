package exceptionhandling;

public class ExceptionPropagateDemo {
    void m1(){
        int n1 = 10;
        int n2 = 0;
        System.out.println(n1/n2);
    }

    void m2(){
        m1();
    }

    void m3(){
        try {
            m2();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}



class ExceptionPropagationImpl{
    public static void main(String[] args) {
        ExceptionPropagateDemo demo = new ExceptionPropagateDemo();
        demo.m3();
    }
}