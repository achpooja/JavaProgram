import java.util.*;


public class TwoException {
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("Enter first number");
            int a=scan.nextInt();
            System.out.println("Enter second number");
            int b=scan.nextInt();
            int div=a/b;
            System.out.println("Result: " + div);
       }
        catch(ArithmeticException e)
        {
            System.out.println("Infinite");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Only Integer are allowed");
        }
    }
}
