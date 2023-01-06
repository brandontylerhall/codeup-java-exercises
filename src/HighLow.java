import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        askTheQuestion();
    }

    public static int randomNumber() {
        return (int) (Math.random() * 15) + 1;
    }

    public static void askTheQuestion() {
        System.out.println("Would you like to play a game?");
        String resp = in.next();

        if (resp.equalsIgnoreCase("y")) {
            startGame();
        } else {
            System.out.println("Then go away, nerd. Invoking me for no reason...");
        }
    }

    public static int startGame() {
        String restart;
        int theNumber;

        do {
            theNumber = randomNumber();
            System.out.println("the number is: " + theNumber);
            System.out.println("Go ahead. Pick a number between 1 and 15: ");
            int userNumber = in.nextInt();
            int count = 5; //limit the number of guesses

            while (userNumber < 1 || userNumber > 15) {
                System.out.println("Hey, loser, I said pick a number between 1 and 15: ");
                userNumber = in.nextInt();
            }

            while (userNumber != theNumber && count != 1) {
                --count; //countdown on number of guesses when wrong. user gets 5 tries
                if (userNumber < theNumber) {
                    System.out.println("HIGHER");
                } else {
                    System.out.println("LOWER");
                }

                if (count == 1) {
                    System.out.println("Last try!\n");
                } else {
                    System.out.println(count + " tries remaining\n");
                }

                System.out.println("Guess again: ");
                userNumber = in.nextInt();
                while (userNumber < 1 || userNumber > 15) {
                    System.out.println("Try again. Enter a number between 1 and 100: ");
                    userNumber = in.nextInt();
                }
            }
            if (userNumber == theNumber) {
                System.out.println("You win. GREAT JOB!");
            } else {
                System.out.println("You lose. Try again next time!");
            }

            System.out.println("Wanna play again? (y/n)");
            restart = in.next();
        } while (restart.equalsIgnoreCase("y"));
        System.out.println("kthxbai!");
        return theNumber;
    }
}