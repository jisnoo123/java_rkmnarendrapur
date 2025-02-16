import java.util.Scanner;

class complexadd{
    Scanner sc = new Scanner(System.in);
    int r,i;

    void input(){
        System.out.println("Enter the real part:");
        r = sc.nextInt();
        System.out.println("Enter the imaginary part:");
        i = sc.nextInt();
    }

    void display(){
        System.out.println("Complex number = "+r+"+"+i+"i");
    }

    void add(complexadd c1, complexadd c2){
        r = c1.r + c2.r;
        i = c1.i + c2.i;
    }
}

class complex{
    public static void main(String args[]){
        complexadd c1 = new complexadd();
        complexadd c2 = new complexadd();
        complexadd c3 = new complexadd();
        System.out.println("Enter first complex number:");
        c1.input();
        System.out.println("Enter second complex number:");
        c2.input();
        c3.add(c1,c2);
        c3.display();
    }
}