import java.util.Random;
import java.util.Scanner;
public class DiceRollProblem_2
{
        //Make a two player dice game where the rules are as follows:
        //DONE
        //STEP 1:
        //Each player rolls a dice (a normal 1-6 dice) up to 10 times

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //create variables for player score
        int player1Score = playGame(scan, "Player1");
        int player2Score = playGame(scan, "Player2");

        //Create a string to determine the winner of the game
         determineWinner(player1Score, player2Score);

        //print the scores and the winners
        System.out.println("Player1 Score: " + player1Score);
        System.out.println("Player2 Score: " + player2Score);
    }


    public static int playGame(Scanner scanner, String playerName)
    {
        //STEP 2:
        //Each roll is added together
        // with the player's previous rolls as the player's score
        int score = 0;

        System.out.println(playerName + " turn, please roll");
        for(int i = 0; i<=10; i++)
        {

            System.out.println("Rolling the dice...");

            // Generate a random number between 1 and 6 representing the dice roll
            Random rand = new Random();
            int roll = rand.nextInt(6) + 1;

            // Print out the result of the dice roll
            System.out.println("Result of the roll is: " + roll);

            // Add the result of the dice roll to the player's score
            score += roll;

            // Check if the player's score is greater than or equal to 30
            // or if the player decides not to roll again
            if(score >= 30 || !rollAgain(scanner))
            {
                // Break out of the loop if the above conditions are met
                break;
            }
        }
        return score;
    }



    public static boolean rollAgain(Scanner scan)
    {
        System.out.println("Play again? Y/N");

        //not sure if this is correct
        return scan.next().equalsIgnoreCase("y");
    }


    public static void determineWinner(int player1Score, int player2Score)
    {
        //DONE
        //STEP 3:
        //The players wants to score as close as possible to 30 without passing it
        //(a score of 31 or more means they bust)

        //CONTINUE
        //STEP 6:
        //if both players get the same result
        //or both bust it is a tie

        //see if both players get the same result
        if(player1Score > 30 && player2Score > 30)
        {
            System.out.println("It's a tie! both players busted");
        }
        //if player1 has a score higher than 30, then player 2 wins
        else if(player1Score > 30)
        {
            System.out.println("Player2 wins! (player1 busted) ");
        }
        //if player2 has a score higher than 30, then player1 wins
        else if(player2Score > 30)
        {
            System.out.println("Player1 wins! (player2 busted");
        }
        else if(player1Score == player2Score)
        {
            System.out.println("It's a tie! ");

        }
        else
        {

            //The player who got the closest to 30 without busting wins,
            // Define the score that players are aiming to get closest to
            int targetScore = 30;

            // Calculate the abs difference between the target score and each player's score
            int diff1 = Math.abs(targetScore - player1Score);
            int diff2 = Math.abs(targetScore - player2Score);

            // Compare the differences to determine the winner
            if(diff1 == diff2)
            {
                // If the differences are equal, it's a tie
                System.out.println("It's a tie!");
            }
            else if (diff1 < diff2)
            {
                // If player 1's difference is smaller, player 1 wins
                System.out.println("Player one wins!");
            }
            else if (diff2 < diff1)
            {
                // If player 2's difference is smaller, player 2 wins
                System.out.println("Player 2 wins!");
            }
        }
    }
}