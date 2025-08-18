import java.net.*;
import java.io.*;

class server{
    public static void main(String args[]) throws Exception{
        try{
            ServerSocket ss = new ServerSocket(12345);
            System.out.println("Server waiting for client");
            Socket s = ss.accept();
            System.out.println("client hit");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

            //Read the string sent by the client
            String str = br.readLine();

            System.out.println("Server received: " + str);
            String rev = "";

            for(int i=str.length()-1; i>=0; i--){
                char c = str.charAt(i);
                rev = rev + c;
            }

            String output;
            if(rev.equals(str)){
                output = str + " is Palindrome";
            }
            else{
                output = str + " is not Palindrome";
            }

            bw.write(output);
            bw.newLine();
            bw.flush();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}