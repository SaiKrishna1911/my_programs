import java.net.*;
import java.io.*;
class servercopy{
public static void main(String args[])throws Exception{
ServerSocket ss=new ServerSocket(3333);
Socket s=ss.accept();
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
String str,str1;
while((str = br.readLine())!=null)
{
System.out.println("client says: "+str);
str1=br.readLine();
dout.writeBytes(str1+"\n");

}
dout.close();
din.close();
s.close();
ss.close();
    }
}}
