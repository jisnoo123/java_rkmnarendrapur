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

                PreparedStatement pst = con.prepareStatement("SELECT * FROM jisnoo.EMPLOYEE where Employee_ID = ?");
                pst.setString(1, id);

                String msg = "";
                
                try{
                    ResultSet rs = pst.executeQuery();
                    String name, des, sal;
                    
                    // Write to client that data is found
                    bw.write("Found");
                    bw.newLine();
                    bw.flush();

                    // Point rs to the data row
                    rs.next();

                    name = rs.getString("NAME");
                    id = rs.getString("EMPLOYEE_ID");
                    des = rs.getString("DESIGNATION");
                    sal = rs.getString("SALARY");

                    // Write each information seperately to the client

                    bw.write(name);
                    bw.newLine();
                    bw.flush();

                    bw.write(id);
                    bw.newLine();
                    bw.flush();

                    bw.write(des);
                    bw.newLine();
                    bw.flush();

                    bw.write(sal);
                    bw.newLine();
                    bw.flush();

                }
                catch(Exception e){
                    bw.write("Not Found");
                    bw.newLine();
                    bw.flush();
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
