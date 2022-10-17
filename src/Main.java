import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean done = false;
        String playAgain = "";
        String trash = "";

        do {
            int die1 = rnd.nextInt(6)+1;
            int die2 = rnd.nextInt(6)+1;

            int crapsRoll = die1 + die2;

            System.out.println("Die1 was: " + die1 + " and die2 was " + die2);
            System.out.println("The craps roll is " + crapsRoll);

            System.out.print("\nWould you like to play again? [Y/N]: ");
            if(in.hasNextLine())
            {
                playAgain = in.nextLine();
                in.nextLine();
                if(playAgain.equalsIgnoreCase("Y"))
                {
                    done = true;
                }
                if(playAgain.equalsIgnoreCase("N"))
                {
                    
                }
            }
        }while(!done);


    }
}