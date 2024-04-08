import java.io.* ;

public class Main
{

    /*
    Complete the following program so that it computes the sum of all the elements of the array.
    Write the program so that it works even if the dimensions of the rows and columns are changed.
     In other words, use length rather than hard-coded numbers.)
     */

    public static void main ( String[] args )
    {
        int[][] data = {{3, 2, 5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8}};

        // declare the sum
        int sum = 0;

        // compute the sum
        for ( int row=0; row < data.length; row++)
        {
            for ( int col=0; col < data[row].length; col++)
            {
                sum += data[row][col];
            }
        }

        // write out the sum
        System.out.println(sum);

    }
}      