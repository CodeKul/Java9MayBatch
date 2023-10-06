package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchDemo {
    public static void main(String[] args)throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Sept25Java";
        String username = "codekul";
        String password = "Codekul@123";
        Connection con = null;
        String sql1 = "update emp set sal = 10000 where empno = 7369";
        String sql2 = "update emp set sal = 12000 where empno = 7521";
        con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        st.addBatch(sql1);
        st.addBatch(sql2);
        int[] n = st.executeBatch();
        System.out.println();
        con.close();
    }
}
