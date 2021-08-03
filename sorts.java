import java.util.Scanner;
import java.util.Arrays;
class sorts
{
    public static void main(String args[])
    {
        
        int temp=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Size of Array :"  );
        int n = s.nextInt();
        System.out.println("Enter Elements of Array :"  );
        int[] arr = new int [n];
        for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();
            }
        System.out.println("Unsorted Array :"  );
        System.out.println(Arrays.toString(arr));
        for(int j=0;j<n;j++)
            {
                for(int k=0;k<(n-j-1);k++)
                    {
                        if(arr[k]>arr[k+1])
                            {
                                temp=arr[k];
                                arr[k]=arr[k+1];
                                arr[k+1]= temp;
                            }
                    }
            }
        
        System.out.println("Sorted Array :" );
        System.out.println(Arrays.toString(arr));
        
    }
}


