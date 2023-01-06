import java.util.Scanner;
import java.lang.Math;
public class testingClass {
        static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        diceRoll();
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int diceRoll() {
        System.out.println("How many sides does your pair of dice have?");
        int diceSides = in.nextInt();

        System.out.println("Are you ready to roll your dice?");
        String response = in.next();

        if (response.equalsIgnoreCase("y")) {
            int rollOne = (int) (Math.random() * diceSides) + 1;
            int rollTwo = (int) (Math.random() * diceSides) + 1;
            int totalRoll = add(rollOne, rollTwo);

            System.out.println("On your first roll, you got a " + rollOne + ". On the second, it was a " + rollTwo + ", which totals: " + totalRoll + ". Would you like to roll again? [Y/N]");
            String reroll = in.next();

            if (reroll.equalsIgnoreCase("y")) {
                diceRoll();
            }

            System.out.println("Happy rolling!");

            return totalRoll;
        }

        System.out.println("Why did you invoke me then? Weirdo...");
        return diceSides;
    }
}
