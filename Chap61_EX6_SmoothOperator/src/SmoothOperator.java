public class SmoothOperator
{
    public static void main(String[] args)
    {
        /*
        An audio signal is sometimes stored as a list of int values.
         The values represent the intensity of the signal at successive time intervals.
          Of course, in a program the signal is represented with an array.

        Often a small amount of noise is included in the signal.
        Noise is usually small, momentary changes in the signal level.
        An example is the "static" that is heard in addition to the signal in AM radio.

        Smoothing a signal removes some of the noise and improves the perceptual quality of the signal.
         This exercise is to smooth the values in an integer array.

        Say that the original values are in the array "signal".
        Compute the smoothed array by doing this: Each value smooth[N] is the average of three values:
        signal[N-1], signal[N], and signal[N+1].

        For the first element of smooth, average the first two elements of signal.
         For the last element of smooth, average the last two elements of signal.

        Use integer arithmetic for this so that the values in smooth are integers.
        import java.io.* ;
         */


        int[] signal  = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
        int[] smooth = new int[12];

        // compute the smoothed value for each
        //  cell of the array smooth
        smooth[0]  = (signal[0] + signal[1]) / 2;
                smooth[ signal.length-1 ] = (signal[signal.length - 1] + signal[signal.length - 2]) / 2;
        for (int i=1; i < signal.length -1; i++)
        {
            //signal[N-1], signal[N], and signal[N+1].
            smooth[i] = (signal[i - 1] + signal[i] + signal[i + 1]) / 3;
        }

        // write out the input
        for ( int j=0; j < smooth.length; j++)
        {
            System.out.println(signal[j]);
        }
        System.out.println("smooth");

        // write out the result
        for ( int j=0; j < smooth.length; j++)
        {
            System.out.println(smooth[j]);
        }
    }
}