class A{
    static class B{
        void display(){
            System.out.println("Hi");
        }
    }
}

class snc{
    public static void main(String args[]){
        A.B ob = new A.B();
        ob.display();
    }
}