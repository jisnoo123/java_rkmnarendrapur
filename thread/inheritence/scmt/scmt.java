//Single class multiple thread
class cth extends Thread{
    cth(String nm){
        super(nm);
        start();
    }
    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("Thread "+getName()+" i="+i);
        }
    }
}

class scmt{
    public static void main(String args[]){
        new cth("Jisnoo");
        new cth("Kuldip");
    }
}