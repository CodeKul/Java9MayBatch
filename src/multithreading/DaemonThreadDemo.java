package multithreading;

public class DaemonThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" " +Thread.currentThread().isDaemon());
    }
}

class DaemonThreadImpl{
    public static void main(String[] args) {
        DaemonThreadDemo t1 = new DaemonThreadDemo();
        DaemonThreadDemo t2 = new DaemonThreadDemo();
        t1.setDaemon(true);
        t1.start();


        t2.start();
    }
}