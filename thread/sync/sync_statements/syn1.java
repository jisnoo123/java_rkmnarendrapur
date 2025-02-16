import java.util.Scanner;

class disp{
    void display(String n){
        System.out.println(n);
        System.out.println("car");
    }
}

class syn implements Runnable{
    disp d;
    String s;
    syn(disp ob, String st){
        d = ob;
        s = st;
    }

    public void run(){
        synchronized(d){
            d.display(s);
        }
    }
}

class syn1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        disp ob = new disp();
        System.out.println("Enter three car brands name:");
        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();
        System.out.println();
        syn obj1 = new syn(ob,n1);
        syn obj2 = new syn(ob,n2);
        syn obj3 = new syn(ob,n3);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        t1.start();
        t2.start();
        t3.start();
    }
}