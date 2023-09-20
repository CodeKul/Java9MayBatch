package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=1;i<=10;i++){
            ThreadPool threadPool1 = new ThreadPool(i);
            executorService.execute(threadPool1);
        }
        executorService.shutdown();

    }
}

class ThreadPool extends Thread{
    private int n;

    ThreadPool(int n){
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println("Start "+Thread.currentThread().getName()+ " "+n);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End "+Thread.currentThread().getName()+ " "+n);

    }
}