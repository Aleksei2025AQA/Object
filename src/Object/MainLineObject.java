public class MainLineObject {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 5);
        Point p3 = new Point(5, 5);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p1, p2);
        Line line3 = new Line(p2, p3);

        System.out.println("line1 equals line2: " + line1.equals(line2));
        System.out.println("line1 equals line3: " + line1.equals(line3));

        Line line4 = line1.clone();
        System.out.println("line1 clone start: (" + line4.start.x + ", " + line4.start.y + ")");
        System.out.println("line1 clone end: (" + line4.end.x + ", " + line4.end.y + ")");
    }
}
