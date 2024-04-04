import java.util.Scanner;
public class LargestPosOddInAList
{
    public static void main(String[] args)
    {
       /*
    Write a program that asks the user for 10 positive integers
    and then prints out the largest odd integer of them.

    If no odd integer was entered,
    print out a message that says so.

    The integers can be entered in any order and may be repeated.

    Odd integers may be detected using the % operator with 2


    C:\>java LargeOdd
    Enter integer 1: 2
    Enter integer 2: 3
    Enter integer 3: 4
    Enter integer 4: 2
    Enter integer 5: 8
    Enter integer 6: 22
    Enter integer 7: 9
    Enter integer 8: 3
    Enter integer 9: 1
    Enter integer 10: 46
    The largest odd integer was 9
    C:\>
    Hint: Use a variable for the current integer, for the best so far, and a boolean variable that indicates if a candidate has been found.
    */

        int currentInt = 0;
        int bestInt = 0;
        boolean hasBeenFound = false;

        //Write a program that asks the user for 10 positive integers
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 10 positive integers: ");

        for(int i = 0; i < 10; i++)
        {
            currentInt = scan.nextInt();

            if((currentInt %2 == 1) && currentInt > bestInt)
            {
                bestInt = currentInt;
            }
        }


        //If no odd integer was entered,
        if(bestInt == 0)
        {
            //print out a message that says so.
            System.out.println("Integer that was entered was zero.");
        }
        else
        {
            //and then prints out the largest odd integer of them.
            System.out.println("The largest odd integer is: " + bestInt);
        }
    }
}