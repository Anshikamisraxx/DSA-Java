import java.util.*;
class program
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        //System.out.println("You entered: " + a);
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        //System.out.println("You entered: " + b);
        int sum=a+b;
        System.out.println("Sum: " + sum);
        int product=a*b;
        System.out.println("Product: " + product);
        int difference=a-b;
        System.out.println("Difference: " + difference);
        int quotient=a/b;
        System.out.println("Quotient: " + quotient);
        int remainder=a%b;
        System.out.println("Remainder: " + remainder);
        System.out.println("End of program.");
    }
}