import java.util.*;

class neg extends Exception{}

class factorial{
    int f=1;
    void fact(int n){
        try{
            if(n<0)
                throw new neg();
            else{
                for(int i=1;i<=n;i++){
                    f*=i;
                }
                System.out.println("Factorial="+f);
            }
        }
        catch(neg e){
            System.out.println("Cannot find factorial of negative number");
        }
    }
}


class excep{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        factorial ob = new factorial();
        ob.fact(num);
    }
}
