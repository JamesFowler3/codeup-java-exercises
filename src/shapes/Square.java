package shapes;

public abstract class Square extends Quadrilateral {
    protected Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double side) {

    }

    @Override
    public void setLength(double side) {

    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return 2 * length + 2 * length;
    }
}
