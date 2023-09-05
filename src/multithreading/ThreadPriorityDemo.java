package multithreading;

public class ThreadPriorityDemo extends Thread{
    @Override
    public void run() {
        for (int i=1;i<4;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class ThreadPriorityImpl{
    public static void main(String[] args) {
        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();
        ThreadPriorityDemo t3 = new ThreadPriorityDemo();
        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t2.start();
        t3.start();

        t1.setPriority(3);
        t2.setPriority(8);
        t3.setPriority(2);

        System.out.println("t1 "+t1.getPriority());
        System.out.println("t2 "+t2.getPriority());
        System.out.println("t3 "+t3.getPriority());
    }
}