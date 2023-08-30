package exceptionhandling;

public class InsufficientAmount extends Exception {
    public InsufficientAmount(String msg){
        super(msg);
    }
}
