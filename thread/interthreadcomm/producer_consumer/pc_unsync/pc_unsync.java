package producer_consumer.pc_unsync;

//An incorrect implementation of a producer and consumer

class Q{
    int n;

    synchronized int get(){
        System.out.println("Got: " + n);
        return n;
    }

    synchronized void put(int n){
        this.n = n;
        System.out.println("Put: " + n);
    }
}

class Producer implements Runnable{
    Q q;

    Producer(Q q){
        this.q = q;
        new Thread(this, "Producer").start();
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
        new Thread(this, "Consumer").start();
    }

    public void run(){
        while(true){
            q.get();
        }
    }
}

class pc_unsync{
    public static void main(String args[]){
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}