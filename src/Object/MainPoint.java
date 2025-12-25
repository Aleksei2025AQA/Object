public class MainPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(3, 4);

        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));

        Point p4 = p1.clone();
        System.out.println("p1 clone: (" + p4.x + ", " + p4.y + ")");
    }
}
