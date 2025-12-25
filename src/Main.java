public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction(3, 4);

        System.out.println("f1 equals f2: " + f1.equals(f2));
        System.out.println("f1 equals f3: " + f1.equals(f3));

        Fraction f4 = f1.clone();
        System.out.println("f1 clone: " + f4);
    }
}