package ua.sumdu.edu.entities.functions.D2.meta;

@SuppressWarnings("unused")
public abstract class TransformedFunction2D extends Function2D {

    private Function2D function2D;
    private Function2D substituted;

    public abstract double argToSubst(double arg);
    public abstract double substToArg(double subst);

    public TransformedFunction2D(Function2D function2D, Function2D substituted) {
        this.function2D = function2D;
        this.substituted = substituted;
    }

    @Override
    public double count(double arg) {
        return function2D.count(arg);
    }

    public double countSubst(double subst) {
        return substituted.count(subst);
    }

    public Function2D getFunction2D() {
        return function2D;
    }

    public Function2D getSubstituted() {
        return substituted;
    }
}