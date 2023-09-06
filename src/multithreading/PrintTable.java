package multithreading;

public class PrintTable {
    synchronized void printTable(int no) {
        for (int i = 1; i <= 10; i++) {
//            synchronized (this){
//                System.out.println(i * no);
//            }
            System.out.println(i * no);


            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadImpl {
    public static void main(String[] args) {
        PrintTable printTable = new PrintTable();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                printTable.printTable(5);
            }
        };
        thread1.start();

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                printTable.printTable(7);
            }
        };
        thread2.start();
    }
}