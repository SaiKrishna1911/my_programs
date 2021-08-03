
import java.io.*;
public class javaio
{
    public static void main(String[] args) throws Exception
    {
        InputStreamReader cin = null;
        FileOutputStream out = null;
        try
        {
            cin = new InputStreamReader(System.in);
            out = new FileOutputStream("output.txt");
            System.out.println("Enter Charecters & 'q' to exit :");
            char c;
            do{
                c = (char) cin.read();
                out.write(c);
                }while(c != 'q');
            }
        finally
        {
            if(cin != null)
                {
                    cin.close();
                }
        }
        }
    }
