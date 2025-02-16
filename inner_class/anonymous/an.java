class A{
    void display(){
        System.out.println("Base class Hi");
    }
}

class an{
    public static void main(String args[]){
        A ob = new A(){
            void display(){
                System.out.println("Derived class Hi");
                super.display();
            }
        };
        ob.display();
    }
}