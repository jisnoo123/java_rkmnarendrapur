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

                    // Check whether such data really exists in the DB
                    String is_found = br.readLine();

                    if(is_found.equals("Found")){
                        //Read the employee details sent from the server

                        name = br.readLine();
                        id = br.readLine();
                        des = br.readLine();
                        sal = br.readLine();

                        //Display the details to the user

                        System.out.println("Employee Name: " + name + "\nID: " + id + "\nDesignation: " + des + "\nSalary: " + sal);
                    }
                    else{
                        System.out.println(is_found);
                        System.out.println("No such data exists in the DB");
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