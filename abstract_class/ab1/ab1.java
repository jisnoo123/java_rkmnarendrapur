import java.util.*;
abstract class abs{
    void display(){
        System.out.println("Hi");
    }
}

class abc extends abs{
    public static void main(String args[]){
        abc ob = new abc();
        ob.display();
    }
}