package ua.sumdu.edu.entities.functions.D4;

import ua.sumdu.edu.entities.FibNumbers;
import ua.sumdu.edu.entities.functions.D4.meta.Function4D;

public class NextIntervalCount extends Function4D {

    private static final NextIntervalCount singleton = new NextIntervalCount();

    private NextIntervalCount() {
    }

    public static NextIntervalCount getInstance() {
        return singleton;
    }

    @Override
    public double count(double previousLength, double iterations, double eps) {
        return (previousLength / FibNumbers.get((int) iterations))
                + (eps * ((double) FibNumbers.get((int) iterations - 3) / FibNumbers.get((int)iterations)));
    }
}