import java.util.*;

public class chef{
    int a[],k,n;
    Scanner sc = new Scanner(System.in);
    
    void input(){
        //Takes as input the number of days, k grams of protein and the  bought amount of proteins in an array
        System.out.println("Enter number of days:");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter k grams of protein:");
        k = sc.nextInt();
        System.out.println("Enter the bought amount of protein each day:");

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
    }

    boolean enough(int i){
        if(a[i]<k){
            return false;
        }
        else{
            return true;
        }
    }

    void diet(){
        //Computation part
        int f=0;
        for(int i=0;i<n;i++){
            boolean res = enough(i);
            if(res){
                if(i!=n-1){
                    int ex=a[i]-k;
                    a[i+1]=a[i+1]+ex;
                }
            }
            else{
                f=1;
                System.out.println("No, Day"+(i+1));
                break;
            }
        }
        if(f==0){
            System.out.println("Yes! Diet successfull");
        }
    }

}

class dietplan{
    public static void main(String args[]){
        chef ob = new chef();
        ob.input();
        ob.diet();
    }
}