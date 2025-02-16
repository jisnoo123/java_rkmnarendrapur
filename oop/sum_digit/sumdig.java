import java.util.Scanner;

class sumdig {
    int n,s=0;
    Scanner sc=new Scanner(System.in);
    
    void input(){
        System.out.print("Enter a number:");
        n=sc.nextInt();
        System.out.println();
    }

    void sum(){
        int b=n;
        while(b!=0){
            s=s+(b%10);
            b/=10;
        }
    }

    void display(){
        System.out.println("Sum of "+n+" is : "+s);
    }

    public static void main(String args[]){
        sumdig obj=new sumdig();
        obj.input();
        obj.sum();
        obj.display();
    }
}
