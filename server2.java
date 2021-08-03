import java.net.*;  
import java.io.*;

public class server2 {
    public static void main(String args[]) throws Exception{
        ServerSocket ss=new ServerSocket(888);
        Socket s=ss.accept(); 
        System.out.println("Connected");
        PrintStream ps = new PrintStream(s.getOutputStream());//write to client
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));//read from client
        BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str, str1;  
            while((str = br.readLine()) != null)
            {  
                System.out.println(str);//printing client data
                str1 = kb.readLine();
                ps.println(str1); 
            }  
            ps.close();  
            br.close();  
            kb.close();
            ss.close();
            s.close(); 

            System.exit(0);
        }   
    }
}
