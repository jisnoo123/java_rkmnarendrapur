class A{
    class B{
        void display(){
            System.out.println("Hi");
        }
    }
}

class nic{
    public static void main(String args[]){
        A ob = new A();
        A.B ob1 = ob.new B();
        ob1.display();
    }
}