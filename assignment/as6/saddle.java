import java.util.Scanner;

class as6{
    int m,n;
    int a[][] = new int[10][10];
    Scanner sc = new Scanner(System.in);
    int r[] = new int[10],c[] = new int[10];

    void input(){
        System.out.println("Enter m and n:");
        m = sc.nextInt();
        n = sc.nextInt();
        a = new int[m][n];

        System.out.println("Enter elements:");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    void rowmin(){
        //Finds min element of each row
        for(int i=0;i<m;i++){
            int min=a[i][0];
            for(int j=1;j<n;j++){
                if(a[i][j]<min){
                    min = a[i][j];
                }
            }
            r[i]=min;
        }
    }

    void colmax(){
        //Finds min element of each row
        for(int i=0;i<n;i++){
            int max=a[0][i];
            for(int j=1;j<m;j++){
                if(a[j][i]>max){
                    max = a[j][i];
                }
            }
            c[i]=max;
        }
    }

    void display(){
        System.out.println("Matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    void spt(){
        //Finds the saddle point
        int f=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(r[i]==c[j]){
                    f=1;
                    System.out.println("Cell:("+i+","+j+") Saddle point:"+a[i][j]);
                }
            }
        }
        if(f==0){
            System.out.println("No saddle point");
        }
    }
}

class saddle{
    public static void main(String args[]){
        as6 ob = new as6();
        ob.input();
        ob.display();
        ob.rowmin();
        ob.colmax();
        ob.spt();
    }
}