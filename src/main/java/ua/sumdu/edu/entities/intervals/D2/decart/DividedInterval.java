package ua.sumdu.edu.entities.intervals.D2.decart;

public class DividedInterval extends Interval {

    private DividedInterval left;
    private DividedInterval right;

    public DividedInterval(double a, double b) {
        super(a, b);
    }

    public DividedInterval getLeft() {
        return left;
    }

    public DividedInterval getRight() {
        return right;
    }

    public void divide(double length) {
        if (length <= 0 || length > Math.abs(a - b)) {
            throw new IllegalArgumentException("Wrong interval state: a = " + a + "; b = " + b + "; length = " + length);
        }
        left = new DividedInterval(a, a + length);
        right = new DividedInterval(b - length, b);
    }
}