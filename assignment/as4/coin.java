import java.util.*;
//Coin game

class coin{
    int coins=((int)(Math.random()*10)%10)+30,n,c=0,l,b=coins;
    Scanner sc = new Scanner(System.in);
    
    int input(){
        //Returns the number of coins drawn
        System.out.println("Enter how many coins you want to draw (atmost 3):");
        n=sc.nextInt();
        return n;
    }

    void game(){
        while(coins!=0){
            if(c%2==0){
                //Player 1
                System.out.println("Player 1");
                int p1=input();
                l=1;
                coins=coins-p1;
            }
            else{
                //Player 2
                System.out.println("Player 2");
                int p2=input();
                l=2;
                coins=coins-p2;
            }
            if(coins<0){
                break;
            }
            c++;
        }
    }

    void result(){
        System.out.println("Winner is: Player"+l+"\nCoins:"+b);
    }
}

class coin_ai{
    public static void main(String args[]){
        coin ob = new coin();
        ob.game();
        ob.result();
    }
}