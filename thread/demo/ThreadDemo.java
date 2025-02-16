package thread.demo;

class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start();
    }

    public void run(){
        try{
            for(int i = 1; i<=10; i++){
                System.out.println("Child Thread : " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child Interrupted");
        }

        System.out.println("Child Thread exiting");
    }
}

class ThreadDemo{
    public static void main(String args[]){
        new NewThread();

        try{
            for(int i=1 ; i<=10; i++){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
