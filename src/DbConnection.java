import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String url = "jdbc:mysql://localhost:3306/theaterdb";
    private static final String userName = "root";
    private static final String passWord = "1234";

    public static Connection getConnection() throws SQLException {
        return  DriverManager.getConnection(url,userName,passWord);
    }

}
