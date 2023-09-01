package multithreading;

public class NamingThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Name "+Thread.currentThread().getName());
        System.out.println("in run method");
    }
}

class NamingThreadImpl{
    public static void main(String[] args) {
        NamingThreadDemo t1 = new NamingThreadDemo();
        t1.setName("T1");
        t1.start();
        NamingThreadDemo t2 = new NamingThreadDemo();
        t2.setName("T2");
        t2.start();
    }
}
