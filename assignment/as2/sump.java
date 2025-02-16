import java.util.Scanner;

class sump{
    int n,s=0;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term:");
        n = sc.nextInt();
    }

    void prime(){
        int p=1,f=0; //Counter to count the number of terms added
        for(int i=2;p<=n;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                if(f==0){
                    System.out.print("Primes:");
                    f++;
                }
                System.out.print(i+ " ");
                s=s+i;
                p++;
            }
        }
    }

    void display(){
        System.out.println("\nSum:"+s);
    }

    public static void main(String args[]){
        sump ob = new sump();
        ob.input();
        ob.prime();
        ob.display();
    }
}