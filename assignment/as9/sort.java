import java.util.Scanner;

class as9{
    int a[] = new int[10],b[] = new int[10];
    int n,ct=0,p;
    Scanner sc = new Scanner(System.in);

    int findmax(){
        int mxp=0;
        for(int i=0;i<n;i++){
            if(search(ct,i)==false){
                mxp=i;
                break;
            }
        }
        int max=a[mxp];
        p=mxp;
        for(int i=0;i<n;i++){
            if(a[i]>max && search(ct,i)==false){
                max=a[i];
            }
        }

        return max;
    }

    boolean search(int c, int key){
        int f=0;
        for(int i=0;i<c;i++){
            if(b[i]==key){
                return true; 
            }
        }
        return false; 
    }

    void input(){
        System.out.println("Enter number of elements:");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
    }

    void sort(){
        int fst=0;
        while(ct!=n){
            int min=findmax();
            for(int i=0;i<n;i++){
                boolean sr = search(ct,i);
                if(a[i]<min && sr==false){
                    min = a[i];
                    p=i;
                }
            }
            b[ct] = p;
            ct++;
            fst=1;
        }
    }

    void display(){
        System.out.println("Sorted:");
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}

class sort{
    public static void main(String args[]){
        as9 ob = new as9();
        ob.input();
        ob.sort();
        ob.display();
    }
}