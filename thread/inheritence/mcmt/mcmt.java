//Multiple class multiple thread

class cth1 extends Thread{
    cth1(String nm){
        super(nm);
        start();
    }

    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("Class cth1 Thread="+getName()+" i="+i);
        }
    }
}

class cth2 extends Thread{
    cth2(String nm){
        super(nm);
        start();
    }

    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("Class cth2 Thread="+getName()+" i="+i);
        }
    }
}

class mcmt{
    public static void main(String args[]){
        new cth1("Jisnoo"); //Thread Jisnoo
        new cth2("Kuldip"); //Thread Kuldip
    }
}