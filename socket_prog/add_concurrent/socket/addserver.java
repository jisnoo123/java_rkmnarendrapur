import java.net.*;
import java.io.*;
class add
{
   int sum(int x,int y)
    {
      return x+y;
    }
}
public class addserver
{
    public static void main(String ars[])throws Exception
    {
      ServerSocket sc=new ServerSocket(12345);
        while(true){
             System.out.println("Server waiting for client...");
             Socket s=sc.accept(); 
             System.out.println("Client hit"); 
             Thread t=new Thread(){
               public void run(){
                  try{
               BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
               BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
               int x=Integer.parseInt(br.readLine());
               int y=Integer.parseInt(br.readLine());
                add ob=new add();
              int s=ob.sum(x,y);
               String output="sum is "+s;
                 bw.write(output);
                  bw.newLine();
                  bw.flush();
                  br.close();
                  bw.close();
                  }
                 catch(Exception e){}
                }};
               t.start();
             }
       }
}     
               
