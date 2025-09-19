import java.net.*;
import java.io.*;
import java.util.Scanner;

public class server{
    public static void main(String args[]) throws Exception{
        ServerSocket ss = new ServerSocket(12345);
        Scanner sc = new Scanner(System.in);
        System.out.println("Alone in the chat");
        Socket s = ss.accept();
        System.out.println("Client has joined the chat!");
    
        Thread read_socket = new Thread(){
            //Thread to read from the socket
            public void run(){
                try{
                    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    
                    while(true){
                        String read_str = br.readLine();
                        System.out.println("Client: " + read_str);
                    }
                }
                catch(Exception e){}
            }
        };
    

        Thread write_socket = new Thread(){
            //Thread to write into the socket
            public void run(){
                try{
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                    
                    while(true){
                        String s = sc.nextLine();
                        bw.write(s);
                        bw.newLine();
                        bw.flush();
                    }     
                }
                catch(Exception e){}           
            }
        };

        read_socket.start();
        write_socket.start();
    }
}