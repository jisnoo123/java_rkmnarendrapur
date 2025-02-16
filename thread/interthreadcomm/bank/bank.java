import java.util.Scanner;

class transaction{
    int bal = 10000;

    synchronized void withdrawal(int wamt){
        System.out.println("Withdrawal starts");
        if(wamt>bal){
            System.out.println("Withdrawal paused");
            try{
                wait();
            }
            catch(InterruptedException e){}
            finally{
                System.out.println("Withdrawal resumes");
            }
        }
        bal = bal - wamt;
        System.out.println("Final balance is:"+bal);
    }

    synchronized void deposit(int damt){
        System.out.println("Deposit starts");
        bal = bal + damt;
        System.out.println("Final balance is:"+bal);
        System.out.println("Deposit ends");
        notify();
    }
}

class bank{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        transaction ob = new transaction();
        Thread t1 = new Thread(){
            public void run(){
                ob.withdrawal(12000);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                ob.deposit(5000);
            }
        };
        t1.start();
        t2.start();
    }
}