import java.io.*;
import java.net.*;
import java.util.*;

class server{
public static void main(String a[]) throws Exception
{
ServerSocket ss=new ServerSocket(555);
Socket s=ss.accept();
System.out.println("connection established");
OutputStream obj=s.getOutputStream();
PrintStream ps=new PrintStream(obj);
String str="Hello"; 
ps.println(str);
ps.println("Kumar Sangakkara");
ps.close();
ss.close();
s.close();
}
}
 
