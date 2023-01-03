public class ControlFlowExercises {
    public static void main(String[] args) {
        /*while loop*/
        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }

        /*do while loop*/
        for (int x = 2; x < 1000000; x *= x) {
            System.out.println(x);
        }
//        int x = 2;
//        do {
//            System.out.println(x);
//            x *= x;
//        } while (x < 1000000);
    }
}