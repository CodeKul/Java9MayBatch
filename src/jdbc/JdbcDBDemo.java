package jdbc;

import java.sql.*;

public class JdbcDBDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Sept25Java";
        String username = "codekul";
        String password = "Codekul@123";
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from dept");
            System.out.println("*****Departments******");
            while (rs.next()){
               Integer deptNo =  rs.getInt(1);
                String department = rs.getString(2);
                String location = rs.getString(3);
                System.out.println("Dept No "+deptNo);
                System.out.println("Department "+department);
                System.out.println("Location "+location);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            con.close();
        }
    }
}
