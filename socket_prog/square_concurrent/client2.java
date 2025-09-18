import java.net.*;
import java.util.Scanner;
import java.io.*;

public class client2{
    public static void main(String args[]) throws Exception{
        Socket s = new Socket("localhost", 12345);
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        System.out.println("Enter number:");
        int x = sc.nextInt();

        //Send to server
        bw.write(String.valueOf(x));
        bw.newLine();
        bw.flush();

        //Read the result from server
        String res = br.readLine();
        System.out.println(res);
    }
}