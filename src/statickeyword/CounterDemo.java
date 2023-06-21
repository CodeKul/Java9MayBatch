package statickeyword;

public class CounterDemo {
    static int cnt = 0;
    CounterDemo(){
        System.out.println(cnt++);
    }
}
class CounterDemoImpl{
    public static void main(String[] args) {
        CounterDemo c1 = new CounterDemo();
        CounterDemo c2 = new CounterDemo();
        CounterDemo c3 = new CounterDemo();
        CounterDemo c4 = new CounterDemo();
        CounterDemo c5 = new CounterDemo();
    }
}