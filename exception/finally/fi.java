import java.util.*;
class fi{
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Result="+c);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not possible");
        }
        finally{
            System.out.println("YAYYYYYYY!!!!!!!");
        }
    }
}