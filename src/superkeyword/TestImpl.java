package superkeyword;

public class TestImpl {
    public static void main(String[] args) {
        B b = new B();
        b.show(10);
    }
}

class A{
    int cnt = 30;
    A(){}
    A(String msg){
        System.out.println(msg);
    }
    A(String msg,int i){
        System.out.println(msg + " "+i);
    }
    void display(){
        System.out.println("in parent class display method");
    }
}

class B extends A{
    int cnt = 20;
    B(){
        super("in parent class constructor"); // used to invoke parent class constructor
    }
    B(String a,int i){
        super("in parent class constructor",5);

    }
    void show(int cnt){
        super.display(); //used to invoke parent class method
        System.out.println(cnt);
        System.out.println(this.cnt);
        System.out.println(super.cnt);
    }
}