import java.util.*;
import java.io.*;
class th{
    public static void main(String args[]){
        
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first number:");
            int x = Integer.parseInt(br.readLine());
            System.out.println("Enter second number:");
            int y = Integer.parseInt(br.readLine());
            int s = x+y;
            System.out.println("Sum="+s);
        
        
    }
}