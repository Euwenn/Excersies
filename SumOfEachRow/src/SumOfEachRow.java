public class SumOfEachRow
{

    //Complete the following program so that it computes the sum of the elements in each row.
    public static void main ( String[] args )
    {
        int[][] data = { {3, 2, 5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8} };

        // declare the sum
        int sum = 0;

        // compute the sums for each row
        for ( int row=0; row < data.length; row++)
        {
            // initialize the sum
            sum = 0;

            // compute the sum for this row
            for ( int col=0; col < data[row].length; col++)
            {
                sum += data[row][col];
            }

            // write the sum for this row
            System.out.println(sum);
        }

    }
}