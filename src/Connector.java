
import java.sql.*;
import java.util.Properties;

public class Connector {
    static private Connection CONNECTION;

 public static void connect() throws SQLException {
        Properties props = new Properties();
        props.setProperty("user", Configuration.USER);
        props.setProperty("password", Configuration.PASS);
        CONNECTION = DriverManager.getConnection(Configuration.DB_URL, props);
//        String sql = "Select * from animal";
        System.out.println("connected");
    }
    public static Statement getStatement() throws SQLException{
        return CONNECTION.createStatement();
    }
    public static void executSQL(String sql) throws SQLException{

        CONNECTION.createStatement().execute(sql);
    }
}
