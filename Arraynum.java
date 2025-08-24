import java.util.*;
class Arraynum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<size;i++)
        {
            if(arr[i]<arr[i-1])
            {
                //arr[i-1]=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=arr[i];
            }
        }
        System.out.println("The sorted array is :");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}