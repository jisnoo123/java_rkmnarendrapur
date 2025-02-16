import java.util.Scanner;
import java.math.*;;

class complex{
    Scanner sc = new Scanner(System.in);
    double r,i;

    void input(){
        System.out.println("Enter the real part:");
        r = sc.nextDouble();
        System.out.println("Enter the imaginary part:");
        i = sc.nextDouble();
    }

    void display(){
        System.out.println("Complex number = "+r+"+("+i+")i");
    }

    void add(complex c1, complex c2){
        r = c1.r + c2.r;
        i = c1.i + c2.i;
    }

    void sub(complex c1, complex c2){
        r = c1.r - c2.r;
        i = c1.i - c2.i;
    }

    void mult(complex c1, complex c2){
        r = c1.r * c2.r - c1.i * c2.i;
        i = c1.r * c2.i + c1.i * c2.r;
    }

    void div(complex c1, complex c2){
        r = (c1.r * c2.r + c1.i * c2.i)/(Math.pow(c2.r,2)+Math.pow(c2.i,2));
        i = ((- c1.r * c2.i) + c1.i * c2.r)/(Math.pow(c2.r,2)+Math.pow(c2.i,2));
    }
}

class as13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        complex c1 = new complex();
        complex c2 = new complex();
        complex c = new complex();
        System.out.println("Enter first complex number:");
        c1.input();
        System.out.println("Enter second complex number:");
        c2.input();
        int ch;
        System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division:");
        ch = sc.nextInt();
        
        switch(ch){
            case 1:
                c.add(c1,c2);
                c.display();
                break;
            
            case 2:
                c.sub(c1,c2);
                c.display();
                break;
            
            case 3:
                c.mult(c1,c2);
                c.display();
                break;
            
            case 4:
                c.div(c1,c2);
                c.display();
                break;

            default:
                System.out.println("Enter choice correctly");
        }
    }
}