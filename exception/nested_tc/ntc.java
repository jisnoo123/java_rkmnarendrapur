import java.util.Scanner;
class ntc{
    public static void main(String args[]){
        try{
            int a = Integer.parseInt(args[0]);
            try{
                int b = Integer.parseInt(args[1]);
                int c = a/b;
                System.out.println("Result:"+c);
            }
            catch(NumberFormatException e){
                System.out.println("Second input is not integer");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not possible");
        }
        catch(NumberFormatException e){
            System.out.println("First input is not integer");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter command line input");
        }
    }
}