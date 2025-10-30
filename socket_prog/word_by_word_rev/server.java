import java.net.*;
import java.io.*;

class server{
    public static void main(String args[]) throws Exception{   
        ServerSocket ss = new ServerSocket(12345);
        System.out.println("Waiting for client");
        while(true){
            try{
                Socket s = ss.accept();
                System.out.println("Client hit");
                
                Thread t = new Thread(){
                    public void run(){ 
                        try{
                        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));    
                        
                        String str = br.readLine();
                        str = str + ' ';
                        int nw = 0;
                        
                        String arr[] = new String[100];
                        int ct= 0;

                        String word = "";
                        for(int i=0; i<str.length(); i++){
                            char c = str.charAt(i);
                            
                            if(c==' '){
                                nw++;
                                arr[ct] = word;
                                ct++;
                                word = "";
                            }
                            else{ 
                                word = word + c;
                            }
                        }
                        

                        String rev = "";

                        for(int i=nw-1; i>=0; i--){
                            rev = rev + arr[i] + ' ';
                        }
                        
                        bw.write(rev);
                        bw.newLine();
                        bw.flush();
                        }
                        catch(Exception e){}
                    }
                };

                t.start();
            }
            catch(Exception e){}
        }
    }   
}