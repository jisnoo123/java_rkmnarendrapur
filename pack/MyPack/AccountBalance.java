package pack.MyPack;

class Balance{
    String name;
    double bal;

    Balance(String n, double b){
        name = n;
        bal = b;
    }

    void show(){
        System.out.println("Name: " + name + " Balance: Rs. " + bal);
    }
}

class AccountBalance {
    public static void main(String args[]){
        Balance current[] = new Balance[3];
        current[0] = new Balance("Jisnoo", 300);
        current[1] = new Balance("Kuldip",250);
        current[2] = new Balance("Atmaza", 200);

        for(int i=0; i<3; i++){
            current[i].show();
        }
    }
}
