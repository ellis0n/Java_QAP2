import java.util.Arrays;

public class TestMyLine {
        public static void main(String[] args) {
            // Create an instance of MyLine using the constructor with x and y coordinates
            MyLine line1 = new MyLine(1, 2, 3, 4);

            // Test the getBegin and getEnd methods
            System.out.println("Line 1 begins at: " + line1.getBegin());
            System.out.println("Line 1 ends at: " + line1.getEnd());

            // Test the setBegin and setEnd methods
            MyPoint newBegin = new MyPoint(5, 6);
            MyPoint newEnd = new MyPoint(7, 8);
            line1.setBegin(newBegin);
            line1.setEnd(newEnd);
            System.out.println("Line 1 after setting new begin and end: " + line1);

            // Test the getBeginX, getBeginY, getEndX, and getEndY methods
            System.out.println("Line 1 begin X: " + line1.getBeginX());
            System.out.println("Line 1 begin Y: " + line1.getBeginY());
            System.out.println("Line 1 end X: " + line1.getEndX());
            System.out.println("Line 1 end Y: " + line1.getEndY());

            // Test the setBeginXY, setEndXY, getBeginXY, and getEndXY methods
            line1.setBeginXY(9, 10);
            line1.setEndXY(11, 12);
            System.out.println("Line 1 after setting new begin and end X and Y: " + line1);
            System.out.println("Line 1 begin X and Y: " + Arrays.toString(line1.getBeginXY()));
            System.out.println("Line 1 end X and Y: " + Arrays.toString(line1.getEndXY()));

            // Test the toString method
            System.out.println("Line 1 string representation: " + line1.toString());

            // Test the getLength method
            System.out.println("Line 1 length: " + line1.getLength());

            // Test the getGradient method
            System.out.println("Line 1 gradient: " + line1.getGradient());
        }
    }