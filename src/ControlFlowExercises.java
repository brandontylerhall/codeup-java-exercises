public class ControlFlowExercises {
    public static void main(String[] args) {
        /*infinite loop. but y doe*/
//        for (int x = 2; x < 1000000; x *= x) {
//            System.out.println(x);
//        }
//        int x = 2;
//        do {
//            System.out.println(x);
//            x *= x;
//        } while (x < 1000000);

        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}