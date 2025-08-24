import java.util.*;
class twoArrays
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        //input size of the arrays
        System.out.println("Enter the number of rows :");
        int row=sc.nextInt();
        System.out.println("Enter number of columns :");
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        //input elements in the array
        System.out.println("Enter the elements into the array :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        //output the elements of the array
        System.out.println("The elements in the array are :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        // input element to be searched
        System.out.println("Enter the element for searching :");
        int num=sc.nextInt();
        boolean found=false;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(a[i][j]==num)
                {
                    System.out.println("Index of the element is : row = "+i+" column = "+j);
                    found=true;
                    break;
                }
            }
        }
    }
}