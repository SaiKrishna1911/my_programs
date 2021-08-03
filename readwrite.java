import java.io.*;
class readwrite
{
    public static void main(String a[]) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter FIle Name: ");
        String file = b.readLine();
        FileReader fin = null;
        try
        {
            fin = new FileReader(file);
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File Not found..!");
            return;
        }
        BufferedReader bin = new BufferedReader(fin);
        System.out.println("File Contents :");
        int ch;
        while((ch=bin.read()) != -1)
            {
                System.out.print((char)ch);
            }
        bin.close();
    }
}
