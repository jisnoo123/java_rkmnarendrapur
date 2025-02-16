class cth implements Runnable{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Virus Infected");
        }
    }
}
class thcrt{
    public static void main(String args[]){
        cth ob = new cth();
        Thread t = new Thread(ob);
        t.start();
        for(int i=1;i<=100;i++){
            System.out.println("Mayday Mayday Going down!!!!!!!!!!");
        }
    }
}
