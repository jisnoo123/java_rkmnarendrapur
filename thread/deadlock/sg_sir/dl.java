class dl{
    public static void main(String args[]){
        String r1="wifi",r2="speaker";
        Thread t1 = new Thread(){
            public void run(){
                synchronized(r1){
                    System.out.println("Server 1 holds "+r1);
                    synchronized(r2){
                        System.out.println("server 2 holds "+r2);
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                synchronized(r2){
                    System.out.println("Server 2 holds "+r2);
                    synchronized(r1){
                        System.out.println("Server 1 holds "+r1);
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}