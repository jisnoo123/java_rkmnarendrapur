import java.io.*;
import java.net.*;
import java.util.Scanner;

class server{
    public static void main(String args[]) throws Exception{
        ServerSocket ss = new ServerSocket(12345);
        System.out.println("Waiting for client ....");
        Socket s = ss.accept();
        System.out.println("Cient hit");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        Scanner sc = new Scanner(System.in);

        String num = br.readLine();
        int n = Integer.parseInt(num);
        System.out.println("Received number:" + num);
        int sq = n*n;

        bw.write(Integer.toString(sq));
        bw.newLine();
        bw.flush();

        s.close();
    }
}