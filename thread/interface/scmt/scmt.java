//Single class multiple thread

class cth implements Runnable{
    Thread t;
    cth(String name){
        t = new Thread(this);
        t.setName(name);
        t.start();
    }

    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("Thread "+t.getName()+" i="+i);
        }
    }
}

class scmt{
    public static void main(String args[]){
        new cth("Jisnoo");
        new cth("Kuldip");
    }
}