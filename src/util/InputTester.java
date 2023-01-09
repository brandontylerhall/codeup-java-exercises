package util;
public class InputTester {
    public static void main(String[] args) {
        Input input = new Input();
        input.yesNo();
        input.getInt(1, 10);
        System.out.println(input.getInt(1, 10));
    }
}
