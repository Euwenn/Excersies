import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
       /*
    Write a program that repeatedly asks the user for a proposed password until the user enters an acceptable password.
    When the user enters an acceptable password, the program writes a message and exits.

    Acceptable passwords:

    Are at least 7 characters long.
    Contain both upper and lower case alphabetic characters.
    Contain at least 1 digit.
    The logic of this program can be quite tricky. Hint: use toUpperCase(), toLowerCase, and equals(). You will also need nested ifs.
            */

        Scanner sc = new Scanner(System.in);
        String pass;

        while(true)
        {
            System.out.println("Please enter a password: ");
            pass = sc.next();

            if(validPassword(pass))
            {
                System.out.println("Password accepted.");
                break;
            }
            System.out.println("Not valid");
        }
        sc.close();
    }

    public static boolean validPassword(String pass)
    {

        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;


        if(pass.length() < 7)
        {
            return false;
        }

        for(int i = 0; i < pass.length(); i++)
        {
            char c = pass.charAt(i);


            if(Character.isUpperCase(c))
            {
                hasUpper = true;
            }

            if(Character.isLowerCase(c))
            {
                hasLower = true;
            }

            if(Character.isDigit(c))
            {
                hasDigit = true;
            }

            if(hasUpper && hasLower && hasDigit == true)
            {
                return true;
            }

        }
        return false;
    }
}