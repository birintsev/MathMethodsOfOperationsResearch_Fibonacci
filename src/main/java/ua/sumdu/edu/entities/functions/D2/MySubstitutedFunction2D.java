package ua.sumdu.edu.entities.functions.D2;

import ua.sumdu.edu.entities.functions.D2.meta.Function2D;

public class MySubstitutedFunction2D extends Function2D {

    private static MySubstitutedFunction2D singleton = new MySubstitutedFunction2D();

    private MySubstitutedFunction2D() {
    }

    static MySubstitutedFunction2D getInstance() {
        return singleton;
    }

    @Override
    public double count(double arg) {
        return (3 - 5 * arg) * Math.exp(-5 * arg);
    }
}