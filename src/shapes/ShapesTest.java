package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(6);
        Measurable myShape2 = new Rectangle(8, 2);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
    }
}