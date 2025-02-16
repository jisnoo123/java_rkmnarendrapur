import java.util.*;

class wordrev {
    String s,sp[],r="";
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.print("Enter a sentence:");
        s = sc.nextLine();
    }

    void display(){
        System.out.println("Original sentence:\n"+s);
        System.out.println("Reversed sentence:\n"+r);
    }

    void extract(){
        sp = s.split(" ");
        for(int i=sp.length-1;i>=0;i--){
            r = r+sp[i]+' ';
        }
    }
}

class as15{
    public static void main(String args[]){
        wordrev ob = new wordrev();
        ob.input();
        ob.extract();
        ob.display();
    }
}