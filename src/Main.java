import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean playing = false;
        String playAgain = "";
        String trash = "";
        int newRoll = 0;
        int die1 = rnd.nextInt(6)+1;
        int die2 = rnd.nextInt(6)+1;

        do {
            die1 = rnd.nextInt(6)+1;
            die2 = rnd.nextInt(6)+1;

            int crapsRoll = die1 + die2;

            System.out.println("Die1 was: " + die1 + " and die2 was " + die2);
            System.out.println("The craps roll is " + crapsRoll);
            System.out.println();
            if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
            {
                System.out.println("Craps! You Lose!");
            }
            else if(crapsRoll == 7 || crapsRoll == 11)
            {
                System.out.println("That's a Natural! You Win!");
            }
            else
            {
                System.out.println("Keep playing until you get a 7 or a point sum");

                while (newRoll != crapsRoll && newRoll != 7) {

                    die1 = rnd.nextInt(6)+1;
                    die2 = rnd.nextInt(6)+1;

                    newRoll = die1 + die2;

                    System.out.println("Die1 was: " + die1 + " and die2 was " + die2);
                    System.out.println("The craps roll is " + newRoll);
                    if(newRoll == crapsRoll)
                    {
                        System.out.println("That's Point! You Win!");

                    }
                    else if(newRoll == 7)
                    {
                        System.out.println("You Lose!");
                    }
                    else
                    {
                        System.out.println("Keep playing");
                        System.out.println();
                    }

                }

            }

            System.out.print("\nWould you like to play again? [Y/N]: ");
            if(in.hasNextLine())
            {
                playAgain = in.nextLine();
                if(playAgain.equalsIgnoreCase("y"))
                {
                    playing = true;
                }
                else if(playAgain.equalsIgnoreCase("n"))
                {
                    playing = false;
                }
                else
                {
                    System.out.println("That is not a valid input, please input a valid input!");
                }
            }
            else
            {
                System.out.println("That is not a valid input, please input a valid input!");
            }
        }while(playing);
    }
}

