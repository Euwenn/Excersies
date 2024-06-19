import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main
{

    /*
    Write a program that writes a list of strings to a text file, one string per line.

    Instructions:
    Create a list of strings in your program.
    Write a Java program to write each string in the list to a new line in a text file named output.txt.
         */
    public static void main(String[] args)
    {
        String file = "output.txt";
        String[] strArry = {"apple", "banana", "kiwi", "strawberry"};

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
        {
            for(String fruit : strArry)
            {
                writer.write(fruit);
                writer.newLine();
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }



    }
}