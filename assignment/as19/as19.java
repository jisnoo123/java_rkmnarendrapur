//Stack concept using generic class
import java.util.*;
class stack<T>{
    T st[];
    int top,size;
    stack(int sz){
        top = -1; size = sz;
        st = (T[])new Object[sz];
    }

    void push(T item){
        if(top == size-1){
            System.out.println("Overflow");
        }
        else{
            st[++top] = item;
        }
    }

    void pop(){
        if(top == -1){
            System.out.println("Underflow");
        }
        else{
            T item = st[top--];
            System.out.println("Popped element is "+item);
        }
    }

    void display(){
        int t = top;
        if(t==-1){
            System.out.println("Stack is empty");
        }
        else{
            while(t!=-1){
                System.out.println(st[t--]);
            }
        }
    }
}

class as19{
    public static void main(String args[]){
        int cdt, cop,n; //cdt is choice of data type and cop is choice of operation on the stack
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack:");
        n = sc.nextInt();
        System.out.println("Choose data type: Enter 1 for int, 2 for float, 3 for char, 4 for string and 5 to end");
        System.out.print("Your choice:");
        cdt = sc.nextInt();

        switch(cdt){
            case 1:
                //For integers
                stack<Integer> ob = new stack<Integer>(n);
                do{
                    System.out.println("Enter 1 to push, 2 to pop, 3 to display and 4 to end");
                    cop = sc.nextInt();
                    switch(cop){
                        case 1:
                            //push
                            System.out.println("Enter item:");
                            Integer item = sc.nextInt();
                            ob.push(item);
                            break;
                        
                        case 2:
                            //pop
                            ob.pop();
                            break;
                        
                        case 3:
                            ob.display();
                    }
                }
                while(cop!=4);
                break;
            
            case 2:
                //For float
                stack<Float> obf = new stack<Float>(n);
                do{
                    System.out.println("Enter 1 to push, 2 to pop, 3 to display and 4 to end");
                    cop = sc.nextInt();
                    switch(cop){
                        case 1:
                            //push
                            System.out.println("Enter item:");
                            Float item = sc.nextFloat();
                            obf.push(item);
                            break;
                        
                        case 2:
                            //pop
                            obf.pop();
                            break;
                        
                        case 3:
                            obf.display();
                    }
                }
                while(cop!=4);
                break;
            
            case 3:
                //For char
                stack<Character> obc = new stack<Character>(n);
                do{
                    System.out.println("Enter 1 to push, 2 to pop, 3 to display and 4 to end");
                    cop = sc.nextInt();
                    switch(cop){
                        case 1:
                            //push
                            System.out.println("Enter item:");
                            Character item = sc.next().charAt(0);
                            obc.push(item);
                            break;
                        
                        case 2:
                            //pop
                            obc.pop();
                            break;
                        
                        case 3:
                            obc.display();
                    }
                }
                while(cop!=4);
                break;
            
            case 4:
                //For string
                stack<String> obs = new stack<String>(n);
                do{
                    System.out.println("Enter 1 to push, 2 to pop, 3 to display and 4 to end");
                    cop = sc.nextInt();
                    Scanner scn = new Scanner(System.in);
                    switch(cop){
                        case 1:
                            //push
                            //sc.next();
                            System.out.println("Enter item:");
                            String item = scn.nextLine();
                            obs.push(item);
                            break;
                        
                        case 2:
                            //pop
                            obs.pop();
                            break;
                        
                        case 3:
                            obs.display();
                    }
                }
                while(cop!=4);
                break;
            
            case 5:
                break;
            
        }
    }
}