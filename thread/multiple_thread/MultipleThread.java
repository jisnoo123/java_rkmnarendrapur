package thread.multiple_thread;

class NewThread implements Runnable{
    String name;

    NewThread(String s){
        Thread t = new Thread(this, s);
        name = s;
        t.start();
    }

    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.println(name+" "+ i);
            try{
                Thread.sleep(20);
            }
            catch(InterruptedException e){
                System.out.println(name + " interrupted");
            }
        }
        System.out.println("Thread " + name + " Exiting");
    }
}

class MultipleThread{
    public static void main(String args[]){
        new NewThread("Atmaza");
        new NewThread("Kuldip");
        new NewThread("Sankha");

        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println("Main Thread interrupted");
        }

        System.out.println("Main thread exiting");
    }
}