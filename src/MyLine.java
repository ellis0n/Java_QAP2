public class MyLine {
    // private instance variables
    private MyPoint begin;
    private MyPoint end;

    // Constructor with x and y coordinates supplied
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }
    // Constructor with MyPoint instances for begin and end
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getters and setters for private instance variables
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }


    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setBeginXY(int[] xy) {
        begin.setXY(xy[0], xy[1]);
    }

    public void setEndXY(int[] xy) {
        end.setXY(xy[0], xy[1]);
    }

    public String toString() {
        return "Begins at " + begin + ", ends at " + end;
    }

    public double getLength() {
        return begin.distance(end);
    }



    public double getGradient() {
        return (end.getY() - begin.getY()) / (end.getX() - begin.getX());
    }
}
