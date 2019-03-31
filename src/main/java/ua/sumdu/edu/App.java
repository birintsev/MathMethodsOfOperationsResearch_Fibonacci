package ua.sumdu.edu;

import ua.sumdu.edu.entities.functions.D2.MyTransformedFunction2D;
import ua.sumdu.edu.entities.functions.D2.meta.Function2D;
import ua.sumdu.edu.entities.functions.D2.meta.TransformedFunction2D;
import ua.sumdu.edu.entities.functions.D3.FirstIntervalLengthCount;
import ua.sumdu.edu.entities.functions.D4.NextIntervalCount;
import ua.sumdu.edu.entities.intervals.D2.decart.DividedInterval;
import ua.sumdu.edu.entities.intervals.D2.decart.Interval;
import ua.sumdu.edu.entities.intervals.D2.decart.IntervalImpl;
import ua.sumdu.edu.entities.points.D2.meta.Point2D;
import ua.sumdu.edu.entities.points.Point;

public class App  {
    public static void main( String[] args ) {
        Point result;
        Interval lastInterval;
        int amOfIterations = 6;
        int eps = 0;
        TransformedFunction2D transformedFunction = MyTransformedFunction2D.getInstance();
        DividedInterval interval = new DividedInterval(0, 1);
        interval.divide(FirstIntervalLengthCount.getInstance().count(eps, amOfIterations));
        for (int iteration = 0; iteration < amOfIterations; iteration++) {
            interval = iterate(interval, transformedFunction.getSubstituted());
            interval.divide(NextIntervalCount.getInstance().count(interval.getLength(), amOfIterations, eps));
            System.out.println("New interval: ("
                    + transformedFunction.substToArg(interval.getA()) + ";"
                    + transformedFunction.count(transformedFunction.substToArg(interval.getA()))
                    + ")..........(" +
                    transformedFunction.substToArg(interval.getA()) + ";"
                    + transformedFunction.count(transformedFunction.substToArg(interval.getB())) + ")");
        }
        lastInterval = new IntervalImpl(transformedFunction.substToArg(interval.getA())
                , transformedFunction.substToArg(interval.getB()));
        double minSubst = transformedFunction.countSubst(interval.getA())
                < transformedFunction.countSubst(interval.getB()) ?
                interval.getA() : interval.getB();
        double min = transformedFunction.substToArg(minSubst);
        result = new Point2D(min, transformedFunction.count(min));
        System.out.println("The last interval is " + lastInterval);
        System.out.println("The function acquires the minimum in the " + result);
    }

    private static DividedInterval iterate(DividedInterval previousInterval, Function2D function2D) {
        return Math.min(
                    function2D.count(previousInterval.getLeft().getA())
                    , function2D.count(previousInterval.getLeft().getB()))
                < Math.min(
                    function2D.count(previousInterval.getRight().getA())
                    , function2D.count(previousInterval.getRight().getB()))
                ?
                previousInterval.getLeft() : previousInterval.getRight();
    }
}