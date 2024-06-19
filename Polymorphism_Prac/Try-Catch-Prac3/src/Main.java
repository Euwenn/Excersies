import java.util.Scanner;
public class Main
{

    public static void checkAge(int age) throws InvalidAgeException
    {
        if(age > 150 || age < 0)
        {
            throw new InvalidAgeException("Invalid age. Please enter another Age.");
        }
    }



    public static void main(String[] args)
    {
       /*
       Create a custom exception InvalidAgeException that is thrown when the age entered by the user is negative or greater than 150.
        Write a program that reads an age from the user and throws the custom exception if the age is invalid.
        Use try-with-resources to automatically close the Scanner resource.

        */

        try(Scanner sc = new Scanner(System.in))
        {
            int age = 0;

            System.out.println("Please enter an age: ");
            age = sc.nextInt();

            try
            {
                checkAge(age);
                System.out.println("Age is valid.");
            }
            catch (InvalidAgeException e)
            {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}