package ua.sumdu.edu.entities.functions.D2;

import ua.sumdu.edu.entities.functions.D2.meta.Function2D;

public class MyFunction2DImpl extends Function2D {
    private static MyFunction2DImpl singleton = new MyFunction2DImpl();
    private MyFunction2DImpl(){
    }
    static MyFunction2DImpl getInstance() {
        return singleton;
    }
    @Override
    public double count(double arg) {
        return (3 - arg) * Math.exp(-1 * arg);
    }
}
