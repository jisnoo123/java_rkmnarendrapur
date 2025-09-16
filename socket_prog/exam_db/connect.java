import java.sql.*;

public class connect {
    
    Connection connection() throws Exception{
        //Creates a connection with the Database
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver"); //register driver

            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager"); //create connection object
        } 
        catch (Exception e) {
        }

        return con;
    }
}
