package multithreading;

public class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("in run method");
    }
}

class MyThreadImpl1{
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        Thread thread = new Thread(thread1);
        thread.start();
    }
}