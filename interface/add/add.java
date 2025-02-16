import java.util.*;

interface add{
    int sum(int x, int y);
}

class addition implements add{
    public int sum(int x, int y){
        return x+y;
    }
}

class abc{
    public static void main(String args[]){
        add ob = new addition();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res = ob.sum(x,y);
        System.out.println("Sum is:"+res);
    }
}