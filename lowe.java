import java.util.*;
import java.io.*;
import java.lang.*;
class lowe
{
    public static void main(String[] args) throws Exception
    {
        String X = "";
        String S2 = "";
        String Q2 = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String S1[] = new String[n];
        String Q1[] = new String[n];
        String S = br.readLine();
        String Q = br.readLine();
        try{
            for (int i = 0; i < n; i++){
                       for (int j = i+1; j <= n; j++){
                            S2 = S.substring(i, j);
                            Q2 = S.substring(i, j);
                           for(int k=0;k<n;k++)
                               {
                                   S1[k] = S2;
                                   Q1[k] = Q2;
                               }
                           for (int m=0;m<n;m++)
                               {
                                   String H = S1[m];
                                   String P = Q1[m];
                                   if(H.charAt(m) == P.charAt(m))
                                       {
                                           X += "0";
                                       }
                                   else
                                       {
                                           X += "1";
                                       }
                                   System.out.println(X);
                               }
                       }
            }}
        catch (Exception e) {}
    }
}
