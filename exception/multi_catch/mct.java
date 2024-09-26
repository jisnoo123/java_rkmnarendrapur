import java.util.Scanner;
public class mct{
    public static void main(String args[]){
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("Result:"+c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(NumberFormatException e){
            System.out.println("Please enter integer input");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter command line input");
        }
    }
}