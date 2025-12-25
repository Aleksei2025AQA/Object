import java.util.Arrays;

public class PolyLine {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PolyLine)) return false;
        PolyLine other = (PolyLine) obj;

        if (this.points.length != other.points.length) {
            return false;
        }

        for (int i = 0; i < points.length; i++) {
            if (!this.points[i].equals(other.points[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (Point p : points) {
            hash = hash * 31 + p.hashCode();
        }
        return hash;
    }

    public PolyLine clone() {
        Point[] clonedPoints = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            clonedPoints[i] = new Point(points[i].x, points[i].y);
        }
        return new PolyLine(clonedPoints);
    }
}