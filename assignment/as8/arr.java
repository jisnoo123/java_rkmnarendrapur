import java.util.Scanner;

class arr{
    int a[] = new int[10];
    int n;
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("Enter size:");
        n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
    }

    void findmax(){
        //Finds the max element and its position
        int max=a[0],p=0;
        for(int i=1;i<n;i++){
            if(a[i]>max){
                p=i;
                max = a[i];
            }
        }
        System.out.println("Maximnum element:"+max+" Position:"+p);
    }

    void findmin(){
        //Finds the min element and its position
        int min=a[0],p=0;
        for(int i=1;i<n;i++){
            if(a[i]<min){
                p=i;
                min = a[i];
            }
        }
        System.out.println("Minimum element:"+min+" Position:"+p);
    }

    boolean prime(int num){
        int c=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        else{
            return false;
        }
    }

    void countprime(){
        int f=0,c=0;
        for(int i=0;i<n;i++){
            if(prime(a[i])){
                c++;
                System.out.println("Prime :"+a[i]);
                f=1;
            }
        }
        if(f==0){
            System.out.println("No primes");
        }
        else{
            System.out.println("\nNo. of primes:"+c);
        }
    }

    void bsort(){
        for(int pass = 1;pass<=n-1;pass++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    void bsearch(){
        System.out.println("Enter key:");
        int key = sc.nextInt();
        int lb=0,ub=n-1,f=0,mid;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(a[mid]==key){
                f=1;
                System.out.println("Found at position:"+mid);
                break;
            }
            else if(a[mid]<key){
                lb = mid+1;
            }
            else{
                ub = mid;
            }
        }
        if(f==0){
            System.out.println("Not found");
        }
    }

    void display(){
        System.out.println("Array:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        arr ob = new arr();
        int ch;
        ob.input();
        do{
            System.out.println("Enter:\n1 to findmax\n2 to findmin\n3 to countprime\n4 to bubble sort\n5 to binary search\n6 to display\n7 to stop");
            ch = scn.nextInt();
            switch(ch){
                case 1:
                    ob.findmax();
                    break;
                case 2:
                    ob.findmin();
                    break;
                case 3:
                    ob.countprime();
                    break;
                case 4:
                    ob.bsort();
                    break;
                case 5:
                    ob.bsearch();
                    break;
                case 6:
                    ob.display();
                    break;
                case 7:
                    break;
            }
        }
        while(ch!=7);
    }
}