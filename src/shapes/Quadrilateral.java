package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    int length() {
        return this.length;
    }

    int width() {
        return this.width;
    }

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
