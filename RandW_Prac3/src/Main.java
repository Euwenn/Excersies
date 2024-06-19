import java.io.*;

public class Main
{
    /*
  Write a program that reads the contents of a text file and writes them to another text file.

    Instructions:

    Create a text file named source.txt with some lines of text.
    Write a Java program to read each line from source.txt and write it to a new file named destination.txt.
     */

    public static void main(String[] args)
    {
        String file = "D:\\Personal Coding Projects and Practice\\RandW_Prac3\\src\\source.txt";
        String outputFile = "destination.txt";

        try(BufferedReader readFile = new BufferedReader(new FileReader(file)))
        {
            String line = "";

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}