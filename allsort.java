import java.util.*;

public class allsort
{
//    public int part(int[] a,int lb,int ub)
//    {
//        int pivot = a[0];
//        int start = lb;
//        int end = ub;
//        while(start < end)
//            {
//                while(a[start] >= pivot)
//                    {
//                        start++;
//                    }
//                while(a[end] < pivot)
//                    {
//                        end--;
//                    }
//                if(start<end)
//                    {
//                        int temp = a[start];
//                        a[start] = a[end];
//                        a[end] = temp;
//                    }
//            }
//        int temp = a[lb];
//        a[lb] = a[end];
//        a[end] = temp;
//        return end;
//    }
//    public void quick(int[] a,int lb;int ub)
//    {
//        int loc = part(a,lb,ub);
//        part(a,lb,loc-1);
//        part(a,loc+1,ub);
//    }
    public void mergesort(int[] a,lb,ub)
    {
        int mid = (lb+ub)/2;
        mergesort(a,lb,mid+1);
        mergesort(a,mid,ub);
        merge(a,lb,mid,ub)
    }
    public void merge(int[] a,lb,mid,ub)
    {
        int i=lb;
        int j = mid+1;
        int k=lb;
        while(i<=mid && j<=ub)
            {
                if(a[i] > a[j])
                    {
                        b[k] = a[j];
                        j++;
                    }
                else
                    {
                        b[k] = a[i];
                        i++;
                    }
                k++;
            }
        if(i>mid)
            {
                while(j<=ub)
                    {
                        b[k] = a[j];
                        j++;
                        k++;
                    }
            }
        else
            {
                while(i<=mid)
                    {
                        b[k] = a[i];
                        i++;
                        k++;q
                    }
            }
    }
    public void main(String[] args)
    {
        int a[] = {10,9,4,3,5,2};
        int n = a.length;
//        System.out.println("Bubble");
//        for(int i=0;i<n-1;i++)
//            {
//                int flag = 0;
//                for(int j=0;j<n-i-1;j++)
//                    {
//                        if(a[j] > a[j+1])
//                            {
//                                int temp = a[j+1];
//                                a[j+1] = a[j];
//                                a[j] = temp;
//                                flag = 1;
//                            }
//                    }
//                if(flag == 0)
//                    {
//                        break;
//                    }
//            }
//        for(int i=0;i<n;i++)
//            {
//                System.out.print(a[i]+" ");
//            }
//        System.out.println("Insertion");
//        for(int i=1;i<n;i++)
//            {
//                int temp = a[i];
//                int j=i-1;
//                while(j>=0 && a[j]>temp)
//                    {
//                        a[j+1] = a[j];
//                        j--;
//                    }
//                a[j+1] = temp;
//            }
//        System.out.println("Selection");
//        for(int i=0;i<n-1;i++)
//            {
//                int min = i;
//                for(int j=i+1;j<n;j++)
//                    {
//                        if(a[min] > a[j])
//                            {
//                                min = j;
//                            }
//                    }
//                if(min != i)
//                    {
//                        int temp = a[min];
//                        a[min] = a[i];
//                        a[i] = temp;
//                    }
//            }
        System.out.println("Quick");
        quick(a,0,n);
        for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
    }
}
