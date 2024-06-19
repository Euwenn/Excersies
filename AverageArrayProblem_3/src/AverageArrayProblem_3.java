
public class AverageArrayProblem_3
{
    /*
    Write a Java program that finds the average of an array.
    You can hardcode the array (ie, you don't need to prompt the user for it),
    but you must display the array and the mean average of it.
     */

    public static void main(String[] args)
    {
        //STEP 2: Hardcoded array
        int[] numArray = {10, 20, 30, 40, 50};

        //STEP 3: Display the array
        elementsOfArray(numArray);

        //STEP 4: Calculate and display the mean average
        double average = calcAvrg(numArray);
        System.out.println("The mean average is: " + average);
    }

    //Method to display the elements of the array
    public static void elementsOfArray(int[] array)
    {
        //NOTE: had to youtube how to set up a for each loop correctly
        //Loop through each element of the array
        for(int num : array)
        {
            //Print current element
            System.out.println(num);
        }
    }



    //Method to calculate the mean average of array
    public static double calcAvrg(int[] array)
    {
        //Initialize variable to store the sum of array elements
        int sum = 0;

        //Loop through each element of the array
        for(int num : array)
        {
            //Add the current element to the sum
            sum += num;
        }

        //STOPPED HERE

        //Calculate the mean average. How to calc mean average?
        //maybe return the variable?

        //formula: Adding all given numbers together
        //and then dividing them by the total number of values
        return sum * 1.0 / array.length;
    }


}