import java.net.*;
import java.io.*;

public class server{

    String perform(String incoming){
        int posn = 0;
        char op = '?';

        if(incoming.indexOf('+') !=-1){
            posn = incoming.indexOf('+');
            op = '+';
        }
        else if(incoming.indexOf('-') !=-1){
            posn = incoming.indexOf('-');
            op = '-';
        }
        else if(incoming.indexOf('*') !=-1){
            posn = incoming.indexOf('*');
            op = '*';
        }
        else if(incoming.indexOf('/') !=-1){
            posn = incoming.indexOf('/');
            op = '/';
        }
        else{
            return "No operator";
        }

        int a = Integer.parseInt(incoming.substring(0, posn));
        int b = Integer.parseInt(incoming.substring(posn+1));

        String output;
        switch(op){
            case '+':
                output = Integer.toString(a+b);
                break;

            case '-':
                output = Integer.toString(a-b);
                break;

            case '/':
                output = Double.toString((double)a/b);
                break;

            case '*':
                output = Integer.toString(a*b);
                break;

            default:
                output = "Error";
        }

        return output;
    }
    public static void main(String args[]) throws IOException{
        try{
            server ob = new server();

            ServerSocket ss = new ServerSocket(12345);
            System.out.println("Waiting for client hit");
            Socket s = ss.accept();
            System.out.println("Client hit");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        
            String incoming = br.readLine();

            System.out.println("Received: " + incoming);
            String result = ob.perform(incoming);
            
            bw.write(result);
            bw.newLine();
            bw.flush();

            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}