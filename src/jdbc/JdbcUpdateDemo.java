package jdbc;

import java.sql.Connection;

public class JdbcUpdateDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Sept25Java";
        String username = "codekul";
        String password = "Codekul@123";
        Connection con = null;
        String sql = "update emp set sal = 9000 where empno = 8562";

    }
}
