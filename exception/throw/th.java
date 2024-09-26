import java.util.*;
class th{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter age:");
            int a = sc.nextInt();
            if(a>0 && a<=100){
                System.out.println("Good age");
            }
            else{
                throw new NullPointerException();
            }
        }
        catch(InputMismatchException e){
            System.out.println("Enter integer input");
        }
        catch(NullPointerException e){
            System.out.println("Go to heaven");
        }
    }
}