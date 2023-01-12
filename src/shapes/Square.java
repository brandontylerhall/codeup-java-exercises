package shapes;

public class Square extends Quadrilateral {
    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side *= side;
    }
}