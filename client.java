import java.io.*;
import java.net.*;
class client{
public static void main(String a[]) throws Exception{
Socket s=new Socket("localhost",555);
InputStream obj=s.getInputStream();
BufferedReader b=new BufferedReader(new InputStreamReader(obj));
String str;
while((str= b.readLine())!=null)
System.out.println("from server:"+str);
b.close();
s.close();
}
}
 