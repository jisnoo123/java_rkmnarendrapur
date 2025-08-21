import java.io.*;
import java.sql.*;
import java.net.*;

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
                String name = br.readLine();
                String id = br.readLine();
                String des = br.readLine();
                String sal = br.readLine();

                PreparedStatement pst = con.prepareStatement("INSERT INTO jisnoo.EMPLOYEE values (?,?,?,?)");
                pst.setString(1, name);
                pst.setString(2, id);
                pst.setString(3, des);
                pst.setString(4, sal);

                try{
                    int t = pst.executeUpdate();

                    if(t>0){
                        System.out.println("Inserted Successfully");
                    }
                    else{
                        System.out.println("Insertion failed. Enter details properly");
                    }

                }
                catch(Exception e){
                    System.out.println("Primary Key Violated");
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
