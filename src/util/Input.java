package util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

    }

    private Scanner in;

    public Input() {
        in = new Scanner(System.in);
    }

    public String getString() {
        return in.nextLine();
    }

    public boolean yesNo() {
        String userInput = in.nextLine().toLowerCase();
        switch (userInput) {
            case "n", "no", "uh uh", "nope", "narp", "nah", "nop" -> {
                return false;
            }
            case "y", "yes", "yea", "yeah", "yep", "yarp", "yuh", "yeh" -> {
                return true;
            }
            case "maybe", "mayhaps", "perhaps" -> {
                System.out.println("hmmmm.... so you do? k.");
                return yesNo();
            }
            default -> {
                return yesNo();
            }
        }
    }

    public int getInt(int min, int max) {
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = in.nextInt();

        if (userInput < min || userInput > max) {
            return getInt(min, max);
        }

        return userInput;
    }

    public int getInt() {
        System.out.println("Please enter a whole number:");
        try {
            int userInput = Integer.valueOf(getString());
            return userInput;
        } catch (NumberFormatException e) {
            System.out.println("You probably input something that wasn't a number. Smooth moves! ... Now try again.");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a number between " + min + " and " + max);
        double userInput = in.nextDouble();
        if (userInput < min || userInput > max) {
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble() {
        System.out.println("Please enter a number:");
        try {
            double userInput = Double.valueOf(getString());
            return userInput;
        } catch (NumberFormatException e) {
            System.out.println("You probably input something that wasn't a number. Smooth moves! ... Now try again.");
            return getDouble();
        }
    }
}

