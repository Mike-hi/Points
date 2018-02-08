// A Point object represents a pair of (x, y) coordinates.
// Seventh version: Immutable.
// Class invariant: x >= 0 && y >= 0.
import java.awt.*;
public class PointLess {
    private int x;
    private int y;

    // Constructs a new point at the origin, (0, 0).
    public PointLess() {
        new Point(0, 0);// calls Point(int, int) constructor
    }

    // Constructs a new point with the given (x, y) location.
    // pre: x >= 0 && y >= 0
    public PointLess(Point p) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }

        this.x = p.x;
        this.y = p.y;
    }

    // Returns the distance between this Point and (0, 0).
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Returns whether o refers to a point with the same (x, y)
    // coordinates as this point.
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else {  // not a Point object
            return false;
        }
    }

    //Returns the slope of the 2 points
    public double Slope(Point p1, Point p2){
        double x = p1.x - p2.x;
        double y = p1.y - p2.y;
        return y / x;
    }
    public boolean isCollinear(Point p1, Point p2){
        if(this.x == p1.x && this.x == p2.x){
            return true;
        }
        double p11 = (double)((p2.y - p1.y) / (p2.y - p1.x));
        double p22 = (double)((p2.y - this.y) / (p2.x - this.x));
        if (p11 == p22){
            return true;
        }
        else{
            return false;
        }
    }

    // Returns the x-coordinate of this point.
    public int getX(Point p) {
        return p.x;
    }

    // Returns the y-coordinate of this point.
    public int getY(Point p) {
        return p.y;
    }

    // Returns a String representation of this point.
    public String toString(Point p) {
        return "(" + p.x + ", " + p.y + ")";
    }

    // Shifts this point's location by the given amount.
    // pre: x + dx >= 0 && y + dy >= 0
    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }
}
