class A{
    void display(){
        class B{
            void disp(){
                System.out.println("Hi");
            }
        }
        B ob = new B();
        ob.disp();
    }
}

class ml{
    public static void main(String args[]){
        A obj = new A();
        obj.display();
    }
}