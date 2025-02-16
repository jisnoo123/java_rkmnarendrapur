import java.util.Scanner;

class fraction{
    int n,d;
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("Enter the numerator and the denominator:");
        n = sc.nextInt();
        d = sc.nextInt();
    }

    int minimum(int a, int b){
        if(a<=b)
            return a;
        else    
            return b;
    }

    int gcd(int a,int b){
        if(b%a==0){
            return a;
        }
        else{
            return gcd(b%a,a);
        }
    }

    void add(fraction f1, fraction f2){
        n = f1.n*f2.d + f1.d*f2.n;
        d = f1.d * f2.d;
    }

    void sub(fraction f1, fraction f2){
        n = f1.n*f2.d - f1.d*f2.n;
        d = f1.d * f2.d;
    }

    void mult(fraction f1, fraction f2){
        n = f1.n*f2.n;
        d = f1.d * f2.d;
    }
    
    void div(fraction f1, fraction f2){
        n = f1.n*f2.d;
        d = f2.n*f1.d;
    }

    void display(){
        int g = gcd(n,d);
        n = n/g;
        d = d/g; 
        if(n<0&&d>0 || n>0&&d<0){
            n = Math.abs(n);
            d = Math.abs(d);
            if(d!=1){
                System.out.println("Fraction = -"+n+"/"+d);
            }
            else{
                System.out.println("Fraction = -"+n);
            }
        }
        else{
            if(d!=1){
                System.out.println("Fraction = "+n+"/"+d);
            }
            else{
                System.out.println("Fraction = "+n);
            }
        }
    }
}

class as14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        fraction f1 = new fraction();
        fraction f2 = new fraction();
        fraction f = new fraction();

        System.out.println("Enter first fraction:");
        f1.input();
        System.out.println("Enter second fraction:");
        f2.input();
        int ch;
        System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division:");
        ch = sc.nextInt();

        switch(ch){
            case 1:
                f.add(f1,f2);
                f.display();
                break;
            
            case 2:
                f.sub(f1,f2);
                f.display();
                break;
            
            case 3:
                f.mult(f1,f2);
                f.display();
                break;
            
            case 4:
                f.div(f1,f2);
                f.display();
                break;

            default:
                System.out.println("Enter choice correctly");
        }
    }
}