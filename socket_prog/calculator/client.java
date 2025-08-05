import java.net.*;
import java.io.*;
import java.util.Scanner;

public class client{
    int a, b; char op;
    String str;
    Scanner sc = new Scanner(System.in);
    
    String input(){
        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter operation (+, -, /, *):");
        char op = sc.next().charAt(0);
        
        str = Integer.toString(a) + op + Integer.toString(b);

        return str;
    }

    
    public static void main(String args[]) throws IOException{

        try{
            Socket s = new Socket("127.0.0.1", 12345);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

            client ob = new client();
            String str = ob.input();

            bw.write(str);
            bw.newLine();
            bw.flush();

            String result = br.readLine();
            System.out.println("Result: " + result);

            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}