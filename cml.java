import java.io.*;
import java.util.*;

class cml
{
    public static void main(String[] args) throws Exception
    {
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int g[] = new int[N];
        for(int i=0;i<N;i++)
            {
                g[i]=Integer.parseInt(br.readLine());
            }
        
        try
        {
            for(int i=0;i<N;i++)
                {
                    if (g[i]==4)
                        {
                            count++;
                            g[i]=0;
                        }
                }
            
        for(int i=0;i<N;i++)
            {
                for(int j=i+1;j<N;j++)
                    {
                        if(g[i]+g[j]==4)
                            {
                                count1++;
                                g[j]=0;
                                g[i]=0;
                            }
                    }
            }
            
            
        for(int i=0;i<N;i++)
            {
                if (g[i]!=0)
                    {
                        count2++;
                    }
            }
        }
        catch (Exception e){}
        System.out.println((count+count1+count2)*500);
        
    }
}
