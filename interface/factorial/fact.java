import java.util.*;

interface factorial{
    int facto(int n);
}

class fact implements factorial{
    public int facto(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*facto(n-1);
        }
    }
}

class abc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        factorial ob = new fact();
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int f = ob.facto(num);
        System.out.println(num+"! = "+f);
    }
}