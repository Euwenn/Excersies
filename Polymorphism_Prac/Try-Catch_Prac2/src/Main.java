import java.util.Scanner;
public class Main

{
    public static void main(String[] args)
    {
        /*
        Write a program that reads a string from the user and converts it to an integer.
        Perform division of a fixed number (e.g., 100) by the converted integer.
        Use a try-catch block to handle NumberFormatException if the input is not a valid integer
        and ArithmeticException if there is a division by zero.
         */

        String str = "";
        int convert = 0;

        System.out.println("Please enter a string: ");
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();

        try
        {
            convert = Integer.parseInt(str);
            int div = 100 / convert;

            System.out.println("Result: " + div);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid number format. Try again.");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide by zero. Try again.");
        }
    }
}