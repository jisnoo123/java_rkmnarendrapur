//Fibonacci and prime numbers alternatively
import java.util.*;
class fibpri{
    int num;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term:");
        num=sc.nextInt();
    }

    int fib(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }

    int prime(int l, int n){
        //l is the last generated prime number and n is the nth term to be found out
        for(int i=l+1; ;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2)
                return i;
        }
    }

    void generate(){
        //Generate the sequence
        int last=1;
        for(int i=1;i<=num;i++){
            int f = fib(i);
            int p = prime(last,i);
            System.out.print(f+" "+p+" ");
            last=p; //last generated prime number updated
        }
    }
    public static void main(String args[]){
        fibpri ob = new fibpri();
        ob.input();
        ob.generate();
    }
}