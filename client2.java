import java.net.*;  
import java.io.*;  

public class client2 {
    public static void main(String args[]) throws Exception{
        Socket s = new Socket("localhost",888);   
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());//write to server
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));//read server data
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String str, str1;  
        while(!(str = kb.readLine()).equals("exit")){  
            dos.writeBytes(str + "\n");//writing to server
            str1=br.readLine();
            System.out.println(str1);  
        }  
        
        dos.close(); 
        br.close();
        kb.close();
        s.close();
    }
}
