import java.util.*;

class parent{
	int a;
	Scanner sc = new Scanner(System.in);

	void input_a(){
		System.out.println("\nEnter first number:");
		a = sc.nextInt();
	}
}

class add extends parent{
	int b,s;

	void input_b(){
		System.out.println("\nEnter second number:");
		b = sc.nextInt();
	}

	void sum(){
		s=a+b;
	}

	void display(){
		System.out.println("Sum is : "+s);
	}

	public static void main(String args[]){
		add ob = new add();
		ob.input_a();
		ob.input_b();
		ob.sum();
		ob.display();
	}
}