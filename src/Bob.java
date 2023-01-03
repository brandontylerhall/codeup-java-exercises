import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What can I do for you, nerd?");
        String input = in.nextLine();

        if (input.endsWith("?")) {
            System.out.println("Sure, brah.");
        } else if (input.endsWith("!")) {
            System.out.println("Whoa, chill out, brah!");
        } else if (input.isEmpty()) {
            System.out.println("Fine, brah, be that way!");
        } else {
            System.out.println("Whatever, brah");
        }
    }

}
