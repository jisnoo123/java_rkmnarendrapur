package assignment.as11.employee;
import java.util.Scanner;

class bs_excp extends Exception{
    //To generate an exception if basic salary is negative
}

class des_excp extends Exception{
    //To geneerate an exception if designation is not entered among the following: Clerk, Manager, Salesman, Peon
}

public class employeemain {
    int eid;
    String name, degn;
    public double bs;
    static int excep_c = 0; //To check if an exception has occured
    
    public void inputdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee details");
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter employee number:");
        eid = sc.nextInt();

        System.out.println("Enter designation:");
        try{
            //sc.next();
            degn = sc.next();
            if(degn.equals("Clerk")==false && degn.equals("Peon")==false && degn.equals("Salesman")==false && degn.equals("Manager")==false){
                excep_c++;
                throw new des_excp();
            }
        }
        catch(des_excp e){
            System.out.println("Enter the designation correctly");
        }
        
        if(excep_c == 0){
            System.out.println("Enter Basic Salary:");

            try{
                bs = sc.nextDouble();
                if(bs<0){
                    excep_c++;
                    throw new bs_excp();
                }
            }
            catch(bs_excp e){
                System.out.println("Basic salary is negative");
            }
        }
    }

    public void displaydata(){
        System.out.println("Name: " + name +"\nEmployee ID: " + eid + "\nDesignation:" + degn + "\nBasic Salary:" + bs);
    }
    public static void main(String args[]){
        employeemain ob = new employeemain();
        ob.inputdata();
        if(excep_c==0){
            ob.displaydata();

            employeemain ref = ob;

            assignment.as11.employee.NetSal.calNetSal obj = new assignment.as11.employee.NetSal.calNetSal();
            obj.calns(ref);
        }
    }
}
