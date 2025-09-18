import java.io.*;
import java.net.*;
public class addclent3
{
   public static void main(String ars[])throws Exception
   {
      Socket s=new Socket("localhost",12345);
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     BufferedReader brs=new BufferedReader(new InputStreamReader(s.getInputStream()));
     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
     System.out.println("Enter first number:");
     int x=Integer.parseInt(br.readLine());
     bw.write(String.valueOf(x));
     bw.newLine();
     bw.flush();
     System.out.println("Enter second number:");
    int y=Integer.parseInt(br.readLine());
     bw.write(String.valueOf(y));
     bw.newLine();
     bw.flush();
     String output=brs.readLine();
     System.out.println(output);
      s.close();
   }
}