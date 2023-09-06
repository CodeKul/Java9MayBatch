package multithreading;

import java.util.Scanner;

public class BankTransaction {
    Double balance = 10000.0;
    void deposit(Double amount){
        balance += amount;
        System.out.println("Available Bal "+balance);
    }

    void withdraw(Double amount){
        balance-=amount;
        System.out.println("Available Bal "+balance);
    }
}

class BankTransactionImpl{
    public static void main(String[] args) {
        BankTransaction bankTransaction = new BankTransaction();
        Scanner sc = new Scanner(System.in);
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                bankTransaction.withdraw(5000.0);
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                bankTransaction.withdraw(7000.0);
            }
        };
        thread1.start();
        thread2.start();

    }
}