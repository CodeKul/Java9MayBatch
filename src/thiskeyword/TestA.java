package thiskeyword;

public class TestA {
    void t1(){
        System.out.println("in t1 ");
        //this.t2();
        t2();
    }

    void t2(){
        System.out.println("in t2");
    }
}

class TestAImpl{
    public static void main(String[] args) {
        TestA testA = new TestA();
        testA.t1();
    }
}