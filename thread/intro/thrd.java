class thread{
    public static void main(String args[]){
        Thread t = new Thread();
        //System.out.println(t);
        t.setName("Virus");
        t.setPriority(10);
        System.out.println(t);
    }
}