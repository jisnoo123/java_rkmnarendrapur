import java.util.Scanner;

class chain{
    int ele[] = new int[50],cap,front,rear;

    chain(int max){
        cap = max;
        front = -1;
        rear = -1;
        ele = new int[cap];
    }

    void pushfront(int v){
        if(front==cap-1){
            System.out.println("Full from front");
        }
        else{
            ele[++front] = v;
        }
    }

    int popfront(){
        if(front==-1){
            //Array empty
            return -999;
        }
        else{
            System.out.println("Front="+front);
            int item = ele[front--];
            return item;
        }
    }

    void pushrear(int v){
        if(rear==cap-1){
            System.out.println("Full from rear");
        }
        else{
            ele[++rear]=v;
        }
    }

    int poprear(){
        if(rear==-1){
            //Array empty
            return -999;
        }
        else{
            System.out.println("Rear="+rear);
            int item = ele[rear--];
            return item;
        }
    }

    void display(){
        if(front==-1 && rear==-1){
            System.out.println("Empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(ele[i]+" ");
            }
        }
    }

    public static void main(String args[]){
        int max;
        System.out.println("Enter capacity:");
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();
        chain ob = new chain(max);
        int ch,data;

        do{
            System.out.println("\nEnter\n1 to pushfront\n2 to popfront\n3 to pushrear\n4 to poprear\n5 to display\n6 to end");
            System.out.print("Your choice:");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter data:");
                    data=sc.nextInt();
                    ob.pushfront(data);
                    break;
                case 2:
                    data=ob.popfront();
                    if(data==-999){
                        System.out.println("Empty");
                    }
                    else{
                        System.out.println(data);
                    }
                    break;
                case 3:
                    System.out.println("Enter data:");
                    data=sc.nextInt();
                    ob.pushrear(data);
                    break;
                case 4:
                    data=ob.poprear();
                    if(data==-999){
                        System.out.println("Empty");
                    }
                    else{
                        System.out.println(data);
                    }
                    break;
                case 5:
                    ob.display();
                    break;
                case 6: 
                    break;
            }
        }
        while(ch!=6);
    }
}