import java.util.Arrays;
public class ArrayEquality
{
    // Write your own equals( int[], int[] ) method.
        //import java.util.Arrays;

          public static boolean myEquals( int[] a, int[] b )
          {
              if(a.length != b.length)
              {
                  return false;
              }

              for(int i = 0; i < a.length; i++)
              {
                  if(a[i] != b[i])
                  {
                      return false;
                  }
              }
              return true;
          }

          public static void main ( String[] args )
          {
            int[] arrayA = { 0, 0, 0, 0 };
            int[] arrayB = { 0, 0, 0, 0 };

            System.out.print("Arrays says: ");
            if ( Arrays.equals(arrayA, arrayB))
              System.out.println( "Equal" );
            else
              System.out.println( "NOT Equal" );

            System.out.print("myEquals says: ");
            if ( myEquals(arrayA, arrayB ))
              System.out.println( "Equal" );
            else
              System.out.println( "NOT Equal" );
          }

       //Check that your method agrees with the Arrays method. Pay attention to null arguments and arrays  of one element.




}