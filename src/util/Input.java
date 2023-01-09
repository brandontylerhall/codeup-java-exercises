package util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

    }

    private Scanner in;

    public Input() {
        in = new Scanner(System.in);
    }

    String getString() {
        return in.nextLine();
    }

    boolean yesNo() {
        System.out.println("Please enter yes or no: [Y/N]");
        String answer = in.nextLine().toLowerCase();
        return answer.equals("y") || answer.equals("yes");
    }

    int getInt(int min, int max) {
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = in.nextInt();

        if (userInput < min || userInput > max) {
            return getInt(min, max);
        }

        return userInput;
    }

    public int getInt() {
        System.out.println("Please enter a whole number:");
        int userInput = in.nextInt();
        return userInput;
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
        double userInput = in.nextDouble();
        return userInput;
    }
}

