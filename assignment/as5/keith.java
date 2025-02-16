import java.util.*;

class keith{
    int n,d=0,c=0,f=0;
    int a[] = new int[100];
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("\nEnter a number:");
        n = sc.nextInt();
    }

    void extract(){
        //Extracts the digits and also counts the number of digits present in the number
        int b = n;
        while(b!=0){
            d++;
            b/=10;
        }
        System.out.println("No. of digits:"+d);
        b=n;
        int k=d-1;
        while(k!=-1){
            a[k]=b%10;
            b/=10;
            k--;
        }
        
    }

    void check(){
        //Checks whether number is Keith or not
        int s;
        c=d;
        for(int i=0;i<=100;i++){
            int k=0;
            s=0;
            while(k!=d){
                s = s + a[i+k];
                k++;
            }

            if(s==n){
                f=1;
                break;
            }
            else if(s>n){
                break;
            }
            System.out.println("Bingo!! c="+c);
            a[c]=s;
            c++;
        }
    }

    void display(){
        System.out.println("c="+c);
        for(int i=0;i<c;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        if(f==1){
            System.out.println(n+" is Keith");
        }
        else{
            System.out.println(n+" is not Keith");
        }
    }

}

class as5{
    public static void main(String args[]){
        keith ob = new keith();
        ob.input();
        ob.extract();
        ob.check();
        ob.display();
    }
}