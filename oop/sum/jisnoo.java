import java.util.*;
class sum{
    Scanner sc = new Scanner(System.in);
    int x,y;
    void input(){
        System.out.println("Enter two numbers:");
        x=sc.nextInt();
        y=sc.nextInt();
    }
    void add(){
        int s=x+y;
        System.out.println("Sum is:"+s);
    }
}

public class jisnoo{
    public static void main(String args[]){
        sum obj = new sum();
        obj.input();
        obj.add();
    }
}