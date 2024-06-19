import java.util.Scanner;
public class Main
{


    public static void main(String[] args)
    {

         /*
    Write a program that takes two integers as input from the user.
    Perform division of the first number by the second number.
    Use a try-catch block to handle ArithmeticException in case of division by zero.
         */

        int num1 = 0;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 1 integer: ");
        num1 = sc.nextInt();

        System.out.println("Please enter 1 more integer: ");
        num2 = sc.nextInt();



        try
        {
            int div = num1 / num2;
            System.out.println("Result: " + div);

        }
        catch (ArithmeticException e)
        {
            System.out.println("Error. Can't Divide by 0. Try again.");
        }
    }
}