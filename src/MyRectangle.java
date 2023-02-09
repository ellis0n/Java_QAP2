public class MyRectangle {
    // Private instance variables
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructors
    public MyRectangle() {
        this.topLeft = new MyPoint();
        this.bottomRight = new MyPoint();
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Calculation methods
    public double getWidth() {
        return bottomRight.getX() - topLeft.getX();
    }

    public double getHeight() {
        return bottomRight.getY() - topLeft.getY();
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public String toString() {
        return "[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
