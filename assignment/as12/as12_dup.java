import java.util.InputMismatchException;
import java.util.Scanner;

//Tech number
class more extends Exception{
    //To generate an exception if number of digits is more than 8
}

class odd extends Exception{
    //To generate an exception if number of digits is odd
}

class neg extends Exception{
    //To generate an exception if the number is negative
}
class tech{
    int n,l,r,len,other_ex=0,inp_ex=0,neg_ex=0;
    
    String s;
    void input(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number:");
            n = sc.nextInt();
        }
        catch(InputMismatchException e){
            inp_ex = 1;
            System.out.println("Enter integer input");
        }
    }

    void split(){
        s = String.valueOf(n);
        try{
            len = s.length();
            if(n<0){
                throw new neg();
            }
            if(len>8){
                throw new more();
            }
            if(len%2!=0){
                throw new odd();
            }
        }
        catch(neg e){
            System.out.println("Number is negative");
            neg_ex = 1;
        }
        catch(odd e){
            System.out.println("Number of digits is odd");
            other_ex = 1;
        }
        catch(more e){
            System.out.println("Number of digits is more than 8");
            other_ex = 1;
        }
        if(neg_ex == 0 && other_ex == 0){
            l = Integer.parseInt(s.substring(0,len/2));
            r = Integer.parseInt(s.substring(len/2));
        }
    }

    void istech(){
        if(Math.pow(l+r,2)==n){
            System.out.println("Tech number");
        }
        else{
            System.out.println("Not a Tech number");
        }
    }
}

class as12_dup {
    public static void main(String args[]){
        tech ob = new tech();
        ob.input();
        if(ob.inp_ex==0){
            ob.split();
            if(ob.neg_ex==0 && ob.other_ex==0){
                ob.istech();
            }
        }
    }
}
