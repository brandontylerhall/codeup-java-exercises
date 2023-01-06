import java.util.Scanner;

public class MethodsExercises {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(add(2, 5));
        System.out.println(subtract(15, 6));
        System.out.println(divide(15, 3));
        System.out.println(multiply(9, 5));
        System.out.println(modulus(3, 1));
        int result = getInteger(1, 10);
        System.out.println(result);
        factorialQuestion(1, 10);
        diceRoll();
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }

    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = in.nextInt();

        if (userInput < min || userInput > max) {
            return getInteger(min, max);
        }

        return userInput;
    }

    public static long factorialQuestion(int min, int max) {
        System.out.println("Please enter a number between 1 and 10");
        int factorialToDo = in.nextInt();

        if (factorialToDo < min || factorialToDo > max) {
            return factorialQuestion(min, max);
        }

        long f, factorial = 1;

        for (f = 1; f <= factorialToDo; f++) {
            factorial = factorial * f;
        }

        System.out.println("Factorial of " + factorialToDo + " is: " + factorial + "\n");

        System.out.println("Do you want to do another number?");
        String restart = in.next();

        if (restart.equalsIgnoreCase("y")) {
            factorialQuestion(min, max);
        } else {
            System.out.println("Goodbye, then.");
        }

        return factorial;
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
            String reRoll = in.next();

            if (reRoll.equalsIgnoreCase("y")) {
                diceRoll();
            }

            System.out.println("Happy rolling!");

            return totalRoll;
        }

        System.out.println("Why did you invoke me then? Weirdo...");
        return diceSides;
    }

}
