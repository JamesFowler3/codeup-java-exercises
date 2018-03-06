package shapes;

public class Rectangle {
    protected int width;
    protected int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public int getArea() {
        int area = width * length;
        return area;
    }
    public int getPerimeter() {
        int perimeter = 2 * length + 2 * width;
        return perimeter;
    }
}
