import java.util.Scanner;

class like{
    int l;
    like(int lk){
        l = lk;
    }

    synchronized void like_inc(){
        System.out.println("Before Like is:"+l);
        l+=1;
        System.out.println("After Like is:"+l);
    }
}

class syn2{
    public static void main(String args[]){
        int lk;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current likes:");
        lk = sc.nextInt();
        System.out.println();
        like ob = new like(lk);
        Thread t1 = new Thread(){
            public void run(){
                ob.like_inc();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                ob.like_inc();
            }
        };
        t1.start();
        t2.start();
    }
}