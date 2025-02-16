import java.util.*;

class A{
    int a=10;
}

class B extends A{
    int a=8;

    void display(){
        System.out.println("Within B: "+a+"\nsuper keyword: "+ super.a);
    }

    public static void main(String args[]){
        B ob = new B();
        ob.display();
    }
}