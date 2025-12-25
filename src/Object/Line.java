public class Line {
    Point start;
    Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;
        Line other = (Line) obj;
        return this.start.equals(other.start) && this.end.equals(other.end);
    }

    @Override
    public int hashCode() {
        return start.hashCode() + end.hashCode();
    }

    public Line clone() {
        return new Line(start.clone(), end.clone());
    }
}
