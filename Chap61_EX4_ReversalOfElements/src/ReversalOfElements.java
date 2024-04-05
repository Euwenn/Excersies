public class ReversalOfElements
{
    public static void main(String[] args)
    {
       /*
        Complete the following program so that it reverses the order of the values in data,
         then prints it out.
        */

        //In the first version of the program there is only one array
        //and its values are reversed with some fairly tricky programming



        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        // reverse the data
        for ( int j=0; j < data.length / 2;  j++)
        {
            int temp = data[j];

            //replaces 1 with 14
            data[j] = data[data.length -1 -j];

            //replaces 14 with 1
            data[data.length -1 -j] = temp;
        }

        // write out the new data
        for( int j=0; j < data.length; j++)
        {
            System.out.println(data[j]);
        }

    }

}