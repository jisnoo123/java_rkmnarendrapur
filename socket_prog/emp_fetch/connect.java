import java.sql.*;

class connect{
    Connection con = null;
    
    Connection connect_to_database() throws Exception{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
        }
        catch(Exception e){
            System.out.println(e);
        }

        return con;
    }
} 