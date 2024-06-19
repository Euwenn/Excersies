import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 class Main
{
    /*
    Write a program that reads all the lines from a text file and prints them to the console.

    Instructions:
    Create a text file named input.txt with some lines of text.
    Write a Java program to read each line from the file and print it to the console.

     */

    public static void main(String[] args)
    {
        String fileName = "D:\\Personal Coding Projects and Practice\\Polymorphism_Prac\\Read-and-Write-Prac\\src\\input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line = "";

            while((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}