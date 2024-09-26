//Single class single thread
class cth extends Thread{
    cth(String nm){
        super(nm); //Creates a thread with the name passed as parameter
        start();
    }
    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("Thread "+getName()+" i="+i);
        }
    }
}

class scst{
    public static void main(String args[]){
        new cth("Jisnoo");
        for(int i=1;i<=1000;i++){
            System.out.println("Main i="+i);
        }
    }
}