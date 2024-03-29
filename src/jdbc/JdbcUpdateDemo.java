package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Sept25Java";
        String username = "codekul";
        String password = "Codekul@123";
        Connection con = null;
        String sql = "update emp set sal = ? where empno = ?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,username,password);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1,15000);
        ps.setInt(2,7839);
        int n = ps.executeUpdate();
        System.out.println(n +" row/s affected");
        con.close();
    }
}
