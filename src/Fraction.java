public class Fraction {
    int num;
    int denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fraction)) return false;
        Fraction other = (Fraction) obj;
        return this.num == other.num && this.denum == other.denum;
    }

    @Override
    public int hashCode() {
        return num + denum;
    }

    public Fraction clone() {
        return new Fraction(num, denum);
    }

    @Override
    public String toString() {
        return num + "/" + denum;
    }
}