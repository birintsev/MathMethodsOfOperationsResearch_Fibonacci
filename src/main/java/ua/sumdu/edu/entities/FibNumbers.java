package ua.sumdu.edu.entities;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FibNumbers {
    private static final List<Long> fib = new LinkedList<>(Arrays.asList(1L, 1L));
    public static long get(int num) {
        if (fib.size() <= num ) {
            while (fib.size() != num + 1) {
                fib.add(fib.get(fib.size() - 1) + fib.get(fib.size() - 2));
            }
        }
        return fib.get(num);
    }
}
