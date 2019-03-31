package ua.sumdu.edu.entities.functions.D3;

import ua.sumdu.edu.entities.FibNumbers;
import ua.sumdu.edu.entities.functions.D3.meta.IntervalLengthCount;

public class FirstIntervalLengthCount extends IntervalLengthCount {

    private static FirstIntervalLengthCount singleton = new FirstIntervalLengthCount();

    private FirstIntervalLengthCount() {
    }

    public static FirstIntervalLengthCount getInstance() {
        return singleton;
    }

    @Override
    public double count(double eps, double amOfIterations) {
        return ((double) FibNumbers.get((int) amOfIterations - 2) / FibNumbers.get((int) amOfIterations - 1))
                + eps
                * (Math.pow(-1, amOfIterations) / amOfIterations - 1);
    }
}