import java.util.Scanner;

class static_method{
    static void display(){
        System.out.println("Static method");
    }

    public static void main(String args[]){
        static_method.display();
    }
}