package multithreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("in run method");
    }
}

class MyThreadImpl {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}