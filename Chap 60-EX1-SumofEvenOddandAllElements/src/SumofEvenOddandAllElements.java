public class SumofEvenOddandAllElements
{
    public static void main(String[] args)
    {
        /*
        Complete the following program so that it computes the sum of
        all the elements of the array,

        the sum of the even elements,

       and the sum of the odd elements.

       Assume that all the numbers are zero or positive.

       Even integers are those for which N%2 is zero.
         */


        int[] data = {3, 2, 5, 7, 72, 12, 97, 24, 100};

        // declare and initialize three sums
        int even = 0;
        int odd = 0;
        int total = 0;

        // compute the sums
        for ( int index=0; index < data.length; index++)
        {
            if(data[index] %2 == 0)
            {
                even += data[index];
            }
            else
            {
                odd += data[index];
            }
            total += data[index];

        }

        // write out the three sums
        System.out.println("Even: " + even + " Odd: " + odd + " Total: " + total);
    }
}