package producer_consumer.pc_sync;
//A correct implementation of a producer and consumer

class Q{
    int n;
    boolean valueset = false;

    synchronized int get(){
        while(!valueset){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("Interrupted Exception caught");
            }
        }
        System.out.println("Got: " + n);
        valueset = false;
        notify();
        return n;
    }

    synchronized void put(int n){
        while(valueset){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("Interrupted Exception caught");
            }
        }
        this.n = n;
        valueset = true;
        System.out.println("Put: " + n);
        notify();
    }
}

class Producer implements Runnable{
    Q q;

    Producer(Q q){
        this.q = q;
        new Thread(this,"Producer").start();
    }

    public void run(){
        int i = 0;
        
        while(true){
            q.put(i++);
        }
    }
}

class Consumer implements Runnable{
    Q q;

    Consumer(Q q){
        this.q = q;
        new Thread(this,"Consumer").start();
    }

    public void run(){
        while(true){
            q.get();
        }
    }
}

class pc_sync {
    public static void main(String args[]){
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
