import java.util.*;
class prime{
    int c=0,n;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
    }

    void checkprime(){
        for(int i=1;i<=n;i++){
            if(n%i==0)
                c++;
        }
        if(c==2)
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is not prime");
    }
}

public class jisnoo{
    public static void main(String args[]){
        prime obj=new prime();
        obj.input();
        obj.checkprime();
    }
}