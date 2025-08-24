import java.util.*;
class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched :");
        int num=sc.nextInt();
        boolean found = false;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==num)
            {
                System.out.println("Number found at index: " + i);
                found = true;
                break;
            }
        }
    }
}