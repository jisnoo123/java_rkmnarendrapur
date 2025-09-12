import java.io.*;
import java.net.*;
import java.sql.*;

class server{
    public static void main(String args[]) throws Exception{
        try{
            ServerSocket ss = new ServerSocket(12345);
            System.out.println("Waiting for client ...");
            Socket s = ss.accept();
            System.out.println("Client hit");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

            connect c = new connect();
            Connection con = c.connect_to_database();
            
            String delimeter=br.readLine();

            while(delimeter.equals("begin")){
                String id = br.readLine();

                PreparedStatement pst = con.prepareStatement("DELETE FROM jisnoo.EMPLOYEE WHERE EMPLOYEE_ID = ?");
                pst.setString(1, id);
                
                int t = pst.executeUpdate();

                if(t>0){
                    System.out.println("ID: " + id + " is successfully deleted");
                }
                else{
                    System.out.println("Not deleted");
                }
    
                delimeter = br.readLine();
            }

            System.out.println("Closing server...");
            con.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
