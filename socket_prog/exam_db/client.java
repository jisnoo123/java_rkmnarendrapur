import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client{
	public static void main(String args[]) throws Exception{
		try{
			Socket s = new Socket("127.0.0.1", 12345);

			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter 1 for C, 2 for Java or 3 for Math:");
			String ch = sc.nextLine();

			bw.write(ch);
			bw.newLine();
			bw.flush();

			while (true){ 
				String ques = br.readLine();
				System.out.println(ques);

				if(ques.startsWith("Marks:")){
					break;
				}
				
				for(int i=1; i<=4; i++){
					String q = br.readLine();
					System.out.println(q);
				}

				String choice = sc.nextLine();

				bw.write(choice);
				bw.newLine();
				bw.flush();
			}

			s.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}


/*
 * Sample Output:
 * 
 * Server:
 * Server waiting....
   Client hit
   Questions finished

   Client:
   Enter 1 for C, 2 for Java or 3 for Math:
1
Question: Who created C?
1) Montipython
2) mishra
3) Riche
4) Gashling
3
Question: C language type?
1) middle level
2) high level
3) low level
4) scripted
1
Marks: 2.0
 */