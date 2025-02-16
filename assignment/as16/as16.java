import java.util.Scanner;
class ascending{
    int n;
    String s[] = new String[10];
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("Enter number of names:");
        n = sc.nextInt();
        s = new String[n];
        for(int i=0;i<n;i++){
            System.out.print("\nEnter name:");
            s[i] = sc.next();
        }
    }

    void sort(){
        //Applying bubble sort
        for(int pass=1;pass<=n;pass++){
            for(int i=0;i<n-1;i++){
                if(s[i].compareTo(s[i+1])>0){
                    String t = s[i];
                    s[i] = s[i+1];
                    s[i+1] = t;
                }
            }
        }
    }

    void display(){
        System.out.println("Ascending order:");
        for(int i=0;i<n;i++){
            System.out.print(s[i]+" ");
        }
    }
}

class as16{
    public static void main(String args[]){
        ascending ob = new ascending();
        ob.input();
        ob.sort();
        ob.display();
    }
}