import java.util.Scanner;

class a_arr{
    int n;
    int a[] = new int[100],b[] = new int[100];
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("Enter number of elements:");
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
    }

    void arng(){
        //First placing the negative elements
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                b[c]=a[i];
                c++;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]>0){
                b[c]=a[i];
                c++;
            }
        }
    }

    void display(){
        System.out.println("Arranged:");
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}

class arrange{
    public static void main(String args[]){
        a_arr ob = new a_arr();
        ob.input();
        ob.arng();
        ob.display();
    }
}