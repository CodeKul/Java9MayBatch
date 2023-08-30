package exceptionhandling;

public class InvalidAmount extends RuntimeException{
    public InvalidAmount(String msg){
        super(msg);
    }
}
