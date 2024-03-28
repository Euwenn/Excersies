import java.util.Scanner;
public class RecursionProblem1
{
    public static void main(String[] args)
    {
        /*
        //STEP 1:
        //ask user for 2 numbers. store numbers
        Write a program using recursion (no loops!) that asks for two numbers

        //STEP 2:
        and sums all the numbers from the lower number to the higher number inclusive:

        examples:
        Enter the first number: 5
        Enter the second number: 12
        Sum from 5 to 12 is 68

        Enter the first number: 8
        Enter the second number: 2
        Sum from 2 to 8 is 35

        If you have problems writing it using recursion try to write it with a loop first.
         */

        //two variables to store the users numbers
        int firstNum;
        int secondNum;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        firstNum = scan.nextInt();

        System.out.println("Enter the second number: ");
        secondNum = scan.nextInt();

        /*
        //DIDNT WORK
        //every number up to and between the first and second num
        //sum all the numbers from lowest to highest
        for(; firstNum <= secondNum; firstNum++ )
        {
            System.out.println("Sum from " + firstNum + "to " + secondNum + "is ");
        }
        */

        //try an if statement?
        //Make sure num1 is smaller than or equal to num2
        if(firstNum > secondNum)
        {
           int tempNum = firstNum;
           firstNum = secondNum;
           secondNum = tempNum;
        }



        //Calculate and display the sum
        int sum = sumRange(firstNum, secondNum);
        System.out.println("Sum from " + firstNum + " to " + secondNum + " is " + sum);
    }

    //Could only get to here. Am stuck on making the recursive method
    //method to calculate the sum of numbers from num1 to num2
    public static int sumRange(int num1, int num2)
    {
        if(num1 == num2) //stopping at num2
        {
            return num2; //if num1 is = num2 then return num2
        }
        return num1 + sumRange(num1 + 1, num2); //returns num1 + the sum of num1 + 1 to num2
    }













}