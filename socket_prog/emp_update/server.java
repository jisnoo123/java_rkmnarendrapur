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
                PreparedStatement check_pst = con.prepareStatement("SELECT * FROM jisnoo.EMPLOYEE WHERE EMPLOYEE_ID = ?");
                check_pst.setString(1, id);
                ResultSet rs = check_pst.executeQuery();
                
                int ct = 0;

                while(rs.next()){
                    ct++;
                }

                if(ct == 0){
                    String msg = "Employee with this ID does not exist" ;
                    bw.write(msg);
                    bw.newLine();
                    bw.flush();
                }
                else{
                    //Write good to client if such an ID does exist
                    bw.write("good");
                    bw.newLine();
                    bw.flush();
                    
                    String name = br.readLine();
                    String des = br.readLine();
                    String sal = br.readLine();
                    PreparedStatement pst = con.prepareStatement("UPDATE jisnoo.EMPLOYEE SET NAME = ?, DESIGNATION = ?, SALARY = ? WHERE EMPLOYEE_ID = ?");
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
