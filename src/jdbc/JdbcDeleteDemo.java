package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Sept25Java";
        String username = "codekul";
        String password = "Codekul@123";
        Connection con = null;
        String sql = "Delete from emp where empno = ?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,username,password);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,8562);
        int n = ps.executeUpdate();
        System.out.println(n +" row/s affected");
        con.close();
    }
}
