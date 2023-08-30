package exceptionhandling;

interface Bank{
    void depositMoney(Double amount);
    void withdrawMoney(Double amount);
}

class BankImpl implements Bank{
    private Double balanceAmount = 5000.0;

    @Override
    public void depositMoney(Double amount) {
        if (amount > 0) {
            balanceAmount = balanceAmount + amount;
        }
        else {
            try {
                throw new InvalidAmount("Invalid amount");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Balance: "+balanceAmount);
    }

    @Override
    public void withdrawMoney(Double amount) {
        if (balanceAmount< amount) {
            try {
                throw new InsufficientAmount("Insufficient Balance");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Remaining code");
    }
}

public class CustomExDemo {
    public static void main(String[] args) {
        Bank bank = new BankImpl();
        bank.depositMoney(-1000.0);
       // bank.withdrawMoney(10000.0);
    }
}
