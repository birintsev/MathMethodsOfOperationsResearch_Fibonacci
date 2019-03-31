package ua.sumdu.edu.entities.intervals.D2.decart;

public abstract class Interval {
    double a;
    double b;
    Interval(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getLength() {
        return Math.abs(a - b);
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    @Override
    public String toString() {
        return "Interval{" + a + "..." + b + "}";
    }
}