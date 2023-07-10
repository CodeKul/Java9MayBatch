package mypackage.p3;

//import mypackage.p1.A;
//import mypackage.p1.B;

import mypackage.p1.*;
import mypackage.p1.p4.C;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.show();

        mypackage.p2.B b1 = new mypackage.p2.B();
         b1.show();

        A a = new A();
        a.getMsg();

        C c = new C();
        c.getDisplay();

    }
}
