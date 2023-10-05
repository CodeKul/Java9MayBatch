package jdbc;

import java.sql.*;

public class JdbcInsertDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Sept25Java";
        String username = "codekul";
        String password = "Codekul@123";
        Connection con = null;
        String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,8562);
            ps.setString(2,"JOHN");
            ps.setString(3,"DEVELOPER");
            ps.setInt(4,7934);
            ps.setDate(5, new Date(System.currentTimeMillis()));
            ps.setDouble(6,7000);
            ps.setDouble(7,2000);
            ps.setInt(8,10);
            int n = ps.executeUpdate();
            System.out.println(n + " row/s affected");
        }catch (SQLException|ClassNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            con.close();
        }
    }
}
