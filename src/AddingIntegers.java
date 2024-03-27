import java.util.Scanner;
public class AddingIntegers
{
    public static void main(String[] args)
    {
        /*
        AddUpNumbers, the program that adds integers from the user could be improved
        In some situations it would not be correct to say that the sum of integers is zero when the user,
        in fact, entered no integers.

        (For example, teachers sometimes distinguish between an assignment that got zero points
         and an assignment that was not turned in.)

         //Modify the program so that it writes a
         //message if the first value entered by the user is the sentinal value of zero.
         //Otherwise, the program proceeds as before.


        Enter first integer (enter 0 to quit): 0
        No integers were entered.
        bye

        Enter first integer (enter 0 to quit): 3
        Enter an integer (or 0 to quit): -3
        Enter an integer (or 0 to quit): 0
        Sum of the integers: 0
        bye
         */

        //scan
        Scanner scan = new Scanner(System.in);

        //Step 4: create a value int
        int value;

        //step 3: create a value to add up the ints (sum)
        int sum = 0;

        //create a count value to increment
        int count = 0;

        //scan for user input in value
        System.out.println("Enter first integer (enter 0 to quit): ");
        value = scan.nextInt();

        //make a statement if the value is 0
        if(value == 0)
        {
            System.out.println("No integers were entered. bye");
        }

        //while the value is not zero, execute this loop
        while(value != 0)
        {
            sum = sum + value;

            count++;

            System.out.println( "Enter the " + (count+1) + "th integer (enter 0 to quit):" );
            value = scan.nextInt();

        }
        //print result
        System.out.println( "Sum of the " + count + " integers: " + sum );
    }
}