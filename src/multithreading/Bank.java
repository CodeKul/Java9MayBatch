package multithreading;

public class Bank {
    private Double balance = 2000.0;
    synchronized void depositMoney(Double amt){
        if (amt>0){
            balance += amt;
            System.out.println("Current balance "+balance);
            notify();
        }else {
            System.out.println("Deposited amount must be greater than zero");
        }
    }

    synchronized void withdrawMoney(Double amt){
        if (balance>=amt){
            balance-=amt;
            System.out.println("Available balance1 "+balance);
        }else {
            try {
                System.out.println("thread is waiting");
                wait();
                balance-=amt;
                System.out.println("Available balance2 "+balance);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class BankImpl{
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                bank.withdrawMoney(7000.0);
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                bank.depositMoney(10000.0);
            }
        };
        t2.start();
    }
}