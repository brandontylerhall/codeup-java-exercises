import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*pi exercise*/
//        double pi = 3.14159;
////        /*The value of pi is approximately 3.14.*/
//        System.out.format("The value of pi is approximately %.2f", pi);

        /*Scanner exercise*/
//        System.out.print("Please enter a number: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("You input the number: %d", userInput);

//        System.out.println("Please enter 3 words: ");
//
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//
//        System.out.println("wordOne = " + wordOne);
//        System.out.println("wordTwo = " + wordTwo);
//        System.out.println("wordThree = " + wordThree);

//        System.out.println("Please enter a sentence here: ");
//
//        String sentence = scanner.nextLine();
//        System.out.println("sentence = " + sentence);

        /*Perimeter exercise*/
        System.out.println("Please enter the length of your room: ");
        String length = scanner.nextLine();

        System.out.println("Please enter the width of your room: ");
        String width = scanner.nextLine();

        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);
        int p = (l*2) + (w*2);
        int a = l*w;

        System.out.printf("The area of your room = %d%nThe perimeter of your room = %d", a, p);
    }
}
