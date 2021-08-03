import java.util.*;
import java.io.*;
import java.lang.*;
class cml2
{
    public static void main(String args[] ) throws Exception
        {
                    Scanner sc = new Scanner(System.in);
                    int T = sc.nextInt();
                    for(int m=0;m<T;m++)
                    {
                    int N = sc.nextInt();
                    int A = sc.nextInt();
                    int B = sc.nextInt();
                    int min[] = new int[N+1];
                    int i=0;
                    double s = ((B*N)/(A+B));
                    System.out.println(s);
//                    int mincost = ((A*s*s)+ (B*(N-s)*(N-s)));
//                    int mincost1 = ((A*(s+1)*(s+1)) + (B*(N-(s+1))*(N-(s+1))));
//                    System.out.println(Math.min(mincost,mincost1));
                    }
            
        }
}
        

        
