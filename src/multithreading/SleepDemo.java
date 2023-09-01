package multithreading;

public class SleepDemo extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=5;i++) {
            try {
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
class SleepImpl{
    public static void main(String[] args) {
        SleepDemo t1 = new SleepDemo();
        t1.setName("T1");
        t1.start();
        SleepDemo t2 = new SleepDemo();
        t2.setName("T2");
        t2.start();

    }
}