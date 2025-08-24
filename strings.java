import java.util.*;
class strings
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=sc.nextLine();
        System.out.println("Enter the character to be searched :");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==ch)
            {
                count++;
                System.out.println("Index of the character is :"+i);
            }
        }
        System.out.println("The frequency of the character is :"+count);
        if(count==0)
        {
            System.out.println("Character not found");
        }
        sc.close();
    }
}