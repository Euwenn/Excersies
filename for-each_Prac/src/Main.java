public class Main
{
    /*
    Write a Java program that calculates the sum of all elements in an integer array using a for-each loop.

    Instructions:

    Create an integer array with some elements.
    Use a for-each loop to iterate through the array and calculate the sum of its elements, as well as the min and max.
    Print the sum.
     */

    public static void main(String[] args)
    {
        int[] array1 = {0, 1, 3, 6, 8, -1};

        int min = array1[0];
        int max = array1[0];
        int sum = 0;

        for(int number : array1)
        {
            sum += number;

            if(min > number)
            {
                min = number;
            }

            if(max < number)
            {
                max = number;
            }
        }
        System.out.println(" Min: " + min + " Max: " + max + " Sum: " + sum);
    }
}