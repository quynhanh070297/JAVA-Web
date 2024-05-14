package rikkei.miniproject.until;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB
{
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/category";
    private static final String USER = "root";
    private static final String PASS = "Ilove12a";

    public static Connection getConnection()
    {
        Connection conn = null;
        try
        {
            Class.forName(DRIVER);// khai báo driver

            conn = DriverManager.getConnection(URL, USER, PASS); // mở kết nối
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return conn;
    }

    public static void closeConnection(Connection con)
    {
        try
        {
            if (!con.isClosed())
            {
                con.close();
            }
        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}


