import java.util.*;
import java.lang.Math;
class set {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N[] = new int[T];
        for (int i=0;i<T;i++)
        {
            N[i] = sc.nextInt();
            double j = Math.pow(10,(N[i]-1)) + 11;
            int sum = 0;
            int product = 1;
            for(double k=(int)j;k<(Math.pow(10,N[i]));k++)
            {
                while(k>0)
                {
                    sum = sum + (int)k%10;
                    product = product * (int)(k % 10);
                    k = (int)k / 10;
                }
                if (product >= sum)
                {
                    System.out.println(k);
                    break;
                }
            }
        }

    }
}
