import java.util.*;
class greatest_rem{
    int n,d=0,max=0;
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.print("Enter a number:");
        n=sc.nextInt();
    }

    void digit(){
        //Counts the no. of digits in the number
        int b=n;
        while(b!=0){
            d++;
            b/=10;
        }
    }

    int reverse(int num){
        int r=0;
        while(num!=0){
            r=(r*10)+num%10;
            num/=10;
        }
        return r;
    }

    void compute(){
        for(int i=1;i<=d;i++){
            int b=n,numg=0,c=1;
            while(b!=0){
                if(c!=i){
                    numg=(numg*10)+(b%10);
                }
                b/=10;
                c++;
            }
            numg=reverse(numg);
            System.out.println("Number generated:"+numg);
            if(numg>max){
                max=numg;
            }
        }
    }

    void display(){
        System.out.println("\nMaximum is:"+max);
    }
    public static void main(String args[]){
        greatest_rem obj = new greatest_rem();
        obj.input();
        obj.digit();
        obj.compute();
        obj.display();
    }
}