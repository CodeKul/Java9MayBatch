package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

//        Class.forName("jdbc.T1");
//        T1 t1 = new T1();

        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection()
    }
}

//class T1{
//    {
//        System.out.println("in instance block");
//    }
//    static {
//        System.out.println("in static block");
//    }
//}