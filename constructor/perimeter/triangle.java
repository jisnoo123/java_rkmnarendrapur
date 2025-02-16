import java.util.*;

class triangle{
    double a,b,c,p;

    triangle(double x){
        //Equilateral triangle
        a=b=c=x;
    }

    triangle(double x, double y){
        //Isosceles triangle
        a=b=x;
        c=y;
    }

    triangle(double x, double y, double z){
        //Scalene triangle
        a=x;
        b=y;
        c=z;
    }

    void peri(){
        p=a+b+c;
    }

    void display(){
        System.out.println("Perimeter of triangle: "+p);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter 1 for equilateral triangle, 2 for isosceles and 3 for scalene:");
        int ch = sc.nextInt();
        
        switch(ch){
            case 1:
                System.out.println("\nEnter the side of eq tri:");
                double x1 = sc.nextDouble();
                triangle ob1 = new triangle(x1);
                ob1.peri();
                ob1.display();
                break;

            case 2:
                System.out.println("\nEnter the two sides of iso tri:");
                double x2 = sc.nextDouble();
                double y2 = sc.nextDouble();
                triangle ob2 = new triangle(x2,y2);
                ob2.peri();
                ob2.display();
                break;

            case 3:
                System.out.println("\nEnter the three sides of scalene tri:");
                double x3 = sc.nextDouble();
                double y3 = sc.nextDouble();
                double z3 = sc.nextDouble();
                triangle ob3 = new triangle(x3,y3,z3);
                ob3.peri();
                ob3.display();
                break;

            default:
                System.out.println("----");
        }
    }
}