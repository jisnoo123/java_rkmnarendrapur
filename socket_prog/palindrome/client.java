import java.util.Scanner;
import java.net.*;
import java.io.*;

class client{
    public static void main(String args[]) throws Exception{
        try{
            Socket s = new Socket("127.0.0.1", 12345);
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

            System.out.println("Enter a string:");
            String str = sc.nextLine();

            // Send the string to the server
            bw.write(str);
            bw.newLine();
            bw.flush();

            // Receive the result from the server
            String output = br.readLine();
            System.out.println(output);

            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}