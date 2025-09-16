import java.io.*;
import java.net.*;
import java.sql.*;

public class server{
    public static void main(String args[]) throws Exception{

        try{
            ServerSocket ss = new ServerSocket(12345);
            System.out.println("Server waiting....");
            Socket s = ss.accept();
            System.out.println("Client hit");
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

            connect c = new connect();
            Connection con = c.connection();

            //System.out.println("Enter 1 for C questions, 2 for Java and 3 for Math:");
            int ch = Integer.parseInt(br.readLine());
            String type="";
            if(ch==1){
                type = "C";
            }
            else if(ch==2){
                type = "Java";
            }
            else if(ch==3){
                type = "Math";
            }

            PreparedStatement pst = con.prepareStatement("select * from jisnoo.QUESTIONS where TYPE=?");
            pst.setString(1, type); // Fill the placeholder '?' in the statement

            ResultSet res = pst.executeQuery(); // Returns the table as a ResultSet object

            double marks = 0;

            while(res.next()){
                String ques = "";
                ques = "Question: "+ res.getString(3);
                bw.write(ques);
                bw.newLine();
                bw.flush();

                ques = "1) " + res.getString(4);
                bw.write(ques);
                bw.newLine();
                bw.flush();

                ques = "2) " + res.getString(5);
                bw.write(ques);
                bw.newLine();
                bw.flush();

                ques = "3) " + res.getString(6);
                bw.write(ques);
                bw.newLine();
                bw.flush();

                ques = "4) " + res.getString(7);
                bw.write(ques);
                bw.newLine();
                bw.flush();

                // System.out.println("Ques:" + ques);
                String user_ans = br.readLine();

                if(user_ans.equals(res.getString(8))){
                    marks += 1; // +1 for correct 
                }
                else{
                    marks -= 0.25; // Negative marking
                }
            }

            con.close();

            bw.write("Marks: "+ marks);
            bw.newLine();
            bw.flush();

            System.out.println("Questions finished");
            s.close();
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}