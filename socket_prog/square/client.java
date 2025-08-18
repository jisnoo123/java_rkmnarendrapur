import java.io.*;
import java.net.*;
import java.util.Scanner;

class client{
    public static void main(String args[]) throws Exception{
        Socket s = new Socket("127.0.0.1", 12345);

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        String num = sc.nextLine();

        // Send the number to the server
        bw.write(num);
        bw.newLine();
        bw.flush();

        // Receive the square
        String sq = br.readLine();
        System.out.println(num + '*' + num + '=' + sq);

        s.close();
    }
}