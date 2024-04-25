import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        /*
Write a program where the user enters a string, and the program echos it to the monitor with one character per line:

C:\>java LinePerChar
Enter a string:
Octopus

O
c
t
o
p
u
s
To do this you will need to use the following method from class String:

char charAt( int inx )
This method returns the character that is at index inx of the String. Characters are indexed beginning at index 0.
         */
        String a;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        a = scan.next();

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }

    }
}