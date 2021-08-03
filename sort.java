import java.util.Arrays;
class sort
{
    public static void main(String s[])
    {
        
        int temp=0;
        int n = Integer.parseInt(s[0]);
        int[] arr = new int [n];
        for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(s[i+1]);
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
