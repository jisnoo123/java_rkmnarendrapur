//Circular queue using generic

import java.util.Scanner;

class cqueue<T>{
    T cq[];
    int size, front, rear;

    cqueue(int sz){
        size = sz;
        front = -1;
        rear = -1;
        cq = (T[]) new Object[size];
    }

    void enqueue(T item){
        if(front == -1 && rear == -1){
            //When the queue is empty
            front = 0;
            rear = 0;
            cq[rear] = item;
        }
        else{
            if((rear+1)%size == front){
                System.out.println("Queue is full");
            }
            else{
                rear = (rear + 1)%size;
                cq[rear] = item;
            }
        }
    }

    void dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("Empty queue");
        }
        else{
            T item = cq[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                front = (front + 1)%size;
            }
            System.out.println("Dequeued item is:" + item);
        }
    }
}

class as20{
    public static void main(String args[]){
        int cdt, cop,n; //cdt is choice of data type and cop is choice of operation on the queue
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue:");
        n = sc.nextInt();
        System.out.println("Choose data type: Enter 1 for int, 2 for float, 3 for char, 4 for string and 5 to end");
        System.out.print("Your choice:");
        cdt = sc.nextInt();

        switch(cdt){
            case 1:
                //For integers
                cqueue<Integer> ob = new cqueue<Integer>(n);
                do{
                    System.out.println("Enter 1 to enqueue, 2 to dequeue and 3 to end");
                    cop = sc.nextInt();
                    switch(cop){
                        case 1:
                            //enqueue
                            System.out.println("Enter item:");
                            Integer item = sc.nextInt();
                            ob.enqueue(item);
                            break;
                        
                        case 2:
                            //dequeue
                            ob.dequeue();
                            break;
                        
                        case 3:
                            break;
                    }
                }
                while(cop!=3);
                
                break;
            
            case 2:
                //For float
                cqueue<Float> obf = new cqueue<Float>(n);
                do{
                    System.out.println("Enter 1 to enqueue, 2 to dequeue and 3 to end");
                    cop = sc.nextInt();
                    switch(cop){
                        case 1:
                            //enqueue
                            System.out.println("Enter item:");
                            Float item = sc.nextFloat();
                            obf.enqueue(item);
                            break;
                        
                        case 2:
                            //dequeue
                            obf.dequeue();
                            break;
                        
                        case 3:
                            break;
                    }
                }
                while(cop!=4);
                break;
            
            case 3:
                //For char
                cqueue<Character> obc = new cqueue<Character>(n);
                do{
                    System.out.println("Enter 1 to enqueue, 2 to dequeue, 3 to display and 4 to end");
                    cop = sc.nextInt();
                    switch(cop){
                        case 1:
                            //enqueue
                            System.out.println("Enter item:");
                            Character item = sc.next().charAt(0);
                            obc.enqueue(item);
                            break;
                        
                        case 2:
                            //dequeue
                            obc.dequeue();
                            break;
                        
                        case 3:
                            break;
                    }
                }
                while(cop!=4);
                break;
            
            case 4:
                //For string
                cqueue<String> obs = new cqueue<String>(n);
                do{
                    System.out.println("Enter 1 to enqueue, 2 to dequeue, 3 to display and 4 to end");
                    cop = sc.nextInt();
                    Scanner scn = new Scanner(System.in);
                    switch(cop){
                        case 1:
                            //enqueue
                            //sc.next();
                            System.out.println("Enter item:");
                            String item = scn.nextLine();
                            obs.enqueue(item);
                            break;
                        
                        case 2:
                            //dequeue
                            obs.dequeue();
                            break;
                        
                        case 3:
                            break;
                    }
                }
                while(cop!=4);
                break;
            
            case 5:
                break;
            
        }
    }
}