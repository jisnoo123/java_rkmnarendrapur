import java.net.*;
import java.io.*;
import java.util.Scanner;

public class server{
    public static void main(String args[])throws Exception{
        ServerSocket ss = new ServerSocket(12345);
        
        while(true){
            System.out.println("Server waiting for client...");
            Socket s = ss.accept();
            System.out.println("Client hit");

            Thread t = new Thread(){
                public void run(){
                    try{
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

                        //Read the data sent by the client
                        int x = Integer.parseInt(br.readLine());
                        int sq = x*x;
                        String output = "Square is : " + sq;

                        //Send the result to the client
                        bw.write(output);
                        bw.newLine();
                        bw.flush();

                        //Close the buffered reader and writer objects to save memory
                        bw.close();
                        br.close();
                    }
                    catch(Exception e){}
                }
            };

            t.start();
        }
    }
}