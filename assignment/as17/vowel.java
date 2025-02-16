import java.util.Scanner;

class vowel{
    String s,b="";

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        s = sc.nextLine();
    }

    void create(){
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                b = b + "##";
            }
            else{
                b = b+c;
            }
        }
    }

    void display(){
        System.out.println("New sentence:");
        System.out.println(b);
    }
}

class as17{
    public static void main(String args[]){
        vowel ob = new vowel();
        ob.input();
        ob.create();
        ob.display();
    }
}