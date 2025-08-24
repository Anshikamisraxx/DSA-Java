import java.util.*;
class GCD
{
public static void main(String[] args)
{
    int GCD=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a = sc.nextInt();
    System.out.println("Enter the second number:");
    int b = sc.nextInt();
    for(int i=1; i<=a && i<=b; i++)
    {
        if(a%i==0 && b%i==0)
        {
            GCD = i;
        }
    }
    System.out.println("The GCD of " + a + " and " + b + " is: " + GCD);
    sc.close();
}
}