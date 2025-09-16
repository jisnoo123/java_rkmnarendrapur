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
                String name = br.readLine();
                String des = br.readLine();
                String sal = br.readLine();

                PreparedStatement pst = con.prepareStatement("UPDATE EMPLOYEE
                                        SET EMPLOYEE_NAME = ?, EMPLOYEE_DES = ?, EMPLOYEE_SAL = ?
                                        WHERE EMPLOYEE_ID = ?;");
                pst.setString(1, name);
                pst.setString(2, des);
                pst.setString(3, sal);
                pst.setString(4, id);
                
                int t = pst.executeUpdate();

                if(t>0){
                    System.out.println("ID: " + id + " is successfully updated");
                }
                else{
                    System.out.println("Not updated");
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
