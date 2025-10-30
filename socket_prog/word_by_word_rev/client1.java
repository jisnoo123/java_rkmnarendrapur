import java.net.*;
import java.io.*;
import java.util.Scanner;

class client1{
    public static void main(String args[]) throws Exception{
        Socket s = new Socket("localhost", 12345);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        System.out.println("Enter a sentence:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        bw.write(str);
        bw.newLine();
        bw.flush();

        String rev = br.readLine();
        System.out.println(rev);
    }
}