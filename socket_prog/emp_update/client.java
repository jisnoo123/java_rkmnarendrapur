import java.io.*;
import java.net.*;
import java.util.Scanner;

class client{
    public static void main(String args[]) throws Exception{
        Socket s = new Socket("127.0.0.1", 12345);

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        Scanner sc = new Scanner(System.in);

        int ch;
        do{
            System.out.println("Enter 1 to enter employee id or 2 to exit:");
            ch = sc.nextInt(); //Choice

            switch(ch){
                case 1:
                    bw.write("begin"); //Start delimeter
                    bw.newLine();
                    bw.flush();

                    sc.nextLine();
                    String name, id, des, sal;
                    
                    System.out.println("Enter id:");
                    id = sc.nextLine();
                    //Send ID to server
                    bw.write(id);
                    bw.newLine();
                    bw.flush();

                    String msg;
                    msg = br.readLine();

                    if(msg.equals("good")){
                       
                        System.out.println("Enter new name:");
                        name = sc.nextLine();

                        bw.write(name);
                        bw.newLine();
                        bw.flush();

                        System.out.println("Enter new designation:");
                        des = sc.nextLine();

                        bw.write(des);
                        bw.newLine();
                        bw.flush();

                        System.out.println("Enter new salary:");
                        sal = sc.nextLine();

                        bw.write(sal);
                        bw.newLine();
                        bw.flush();
                    }
                    else{
                        System.out.println(msg);
                    }
                    break;
                
                case 2: 
                    bw.write("end");
                    bw.newLine();
                    bw.flush();
                    break;

                default:
                    System.out.println("Enter properly again");
            }
        }
        while(ch!=2);
    }
}