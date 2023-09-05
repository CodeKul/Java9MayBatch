package multithreading;

public class ThreadYieldDemo extends Thread{
    @Override
    public void run() {
        for (int i=1;i<4;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

class ThreadYieldImpl{
    public static void main(String[] args) {
        ThreadYieldDemo t1 = new ThreadYieldDemo();
        ThreadYieldDemo t2 = new ThreadYieldDemo();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
        for (int i=1;i<4;i++){
            t1.yield();
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

    }
}