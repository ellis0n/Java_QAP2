public class TestMyRectangle {
    public static void main(String[] args) {
        // Test constructors
        MyRectangle rect1 = new MyRectangle();
        System.out.println("Testing default constructor: " + rect1);

        MyRectangle rect2 = new MyRectangle(1, 1, 4, 4);
        System.out.println("Testing constructor with parameters: " + rect2);

        MyPoint topLeft = new MyPoint(2, 2);
        MyPoint bottomRight = new MyPoint(6, 6);
        MyRectangle rect3 = new MyRectangle(topLeft, bottomRight);
        System.out.println("Testing constructor with MyPoint objects: " + rect3);

        // Test getters and setters
        MyPoint newTopLeft = new MyPoint(3, 3);
        rect3.setTopLeft(newTopLeft);
        System.out.println("Testing getTopLeft and setTopLeft methods: " + rect3.getTopLeft());

        MyPoint newBottomRight = new MyPoint(7, 7);
        rect3.setBottomRight(newBottomRight);
        System.out.println("Testing getBottomRight and setBottomRight methods: " + rect3.getBottomRight());

        // Test calculation methods
        System.out.println("Testing getWidth method: " + rect3.getWidth());

        System.out.println("Testing getHeight method: " + rect3.getHeight());

        System.out.println("Testing getArea method: " + rect3.getArea());

        System.out.println("Testing getPerimeter method: " + rect3.getPerimeter());
    }
}
