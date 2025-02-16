import java.util.*;

class area{
    double a,b,c,s,ar;

    area(double x){
        //Equilateral triangle
        a=b=c=x;
    }

    area(double x, double y){
        //Isosceles triangle
        a=b=x;
        c=y;
    }

    area(double x, double y, double z){
        //Scalene triangle
        a=x;
        b=y;
        c=z;
    }

    void area_calc(){
        s=(a+b+c)/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle: "+ar);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter 1 for equilateral triangle, 2 for isosceles and 3 for scalene:");
        int ch = sc.nextInt();
        
        switch(ch){
            case 1:
                System.out.println("\nEnter the side of eq tri:");
                double x1 = sc.nextDouble();
                new area(x1).area_calc();
                break;

            case 2:
                System.out.println("\nEnter the two sides of iso tri:");
                double x2 = sc.nextDouble();
                double y2 = sc.nextDouble();
                new area(x2,y2).area_calc();
                break;

            case 3:
                System.out.println("\nEnter the three sides of scalene tri:");
                double x3 = sc.nextDouble();
                double y3 = sc.nextDouble();
                double z3 = sc.nextDouble();
                new area(x3,y3,z3).area_calc();
                break;

            default:
                System.out.println("----");
        }
    }
}