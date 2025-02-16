import java.util.*;

class add_two{
    int a,b,s;

    add_two(){
        s=0;
    }

    add_two(int x,int y){
        //Parameterised constructor
        a=x;
        b=y;
    }

    void sum(){
        s=a+b;
    }

    void display(){
        System.out.println("Sum:"+s);
    }

    public static void main(String args[]){
        int p,q;
        System.out.println("Enter the two numbers to add:");
        Scanner sc = new Scanner(System.in);
        p=sc.nextInt();
        q=sc.nextInt();
        add_two obj = new add_two(p,q);
        obj.sum();
        obj.display();
    }
}