package multithreading;

public class ThreadJoinDemo extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            try {
                System.out.println(Thread.currentThread().getName() +" "+i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class ThreadJoinDemoImpl{
    public static void main(String[] args) {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        ThreadJoinDemo t2 = new ThreadJoinDemo();
        t1.setName("T1");
        t2.setName("T2");
        t1.start();
        t2.start();
        System.out.println("Before join "+Thread.currentThread().getName());
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("After join "+Thread.currentThread().getName());
    }
}