import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input2;
        do {
            input2 = "";
            System.out.println("What number would you like to go up to?");

            int input = in.nextInt();

            System.out.println("Here is your table! \n");
            System.out.printf(" Table of Powers %n");
            System.out.printf("------------------------%n");
            System.out.printf("%-6s | %-6s | %4s %n", "number", "squared", "cubed");
            System.out.printf("%-6s | %-6s | %4s %n", "------", "-------", "-----");

            for (int i = 1; i <= input; i++) {
                System.out.printf("%-6d | %-7d | %-4d %n", i, i * i, i * i * i);
            }

            System.out.println("Would you like to do another number? [y/n]");
            input2 = in.next();

            if (input2.equalsIgnoreCase("n")) {
                System.out.println("Have a good day, then!");
            }
        } while (input2.equalsIgnoreCase("y"));

        boolean confirmation;
        do {
            System.out.println("Input a numerical grade from 0 to 100");
            int grade = in.nextInt();

            if (grade >= 88) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 67) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Would you like to do another number? [y/n]");
            String input = in.next();
            confirmation = input.equalsIgnoreCase("y");

        } while (confirmation);
        System.out.println("kthxbai");


    }
}