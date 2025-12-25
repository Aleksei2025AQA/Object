public class MainPolyLineObject {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 0);
        Point p3 = new Point(5, 5);

        PolyLine line1 = new PolyLine(p1, p2, p3);
        PolyLine line2 = new PolyLine(p1, p2, p3);
        PolyLine line3 = new PolyLine(p1, p3);

        System.out.println("line1 equals line2: " + line1.equals(line2));
        System.out.println("line1 equals line3: " + line1.equals(line3));

        PolyLine line4 = line1.clone();
        System.out.println("line1 clone equals line1: " + line1.equals(line4));
    }
}