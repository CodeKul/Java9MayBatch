package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileNotFoundDemo {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("abc.txt");
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
