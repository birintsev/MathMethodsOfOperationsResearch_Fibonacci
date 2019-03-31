package ua.sumdu.edu.entities.functions.D2;

import ua.sumdu.edu.entities.functions.D2.meta.Function2D;
import ua.sumdu.edu.entities.functions.D2.meta.TransformedFunction2D;

public class MyTransformedFunction2D extends TransformedFunction2D {

    private static final MyTransformedFunction2D singleton =
            new MyTransformedFunction2D(MyFunction2DImpl.getInstance(), MySubstitutedFunction2D.getInstance());

    private MyTransformedFunction2D(Function2D function2D, Function2D transformed) {
        super(function2D, transformed);
    }

    public static MyTransformedFunction2D getInstance() {
        return singleton;
    }

    @Override
    public double argToSubst(double arg) {
        return arg / 5;
    }

    @Override
    public double substToArg(double subst) {
        return 5 * subst;
    }
}