package ua.sumdu.edu.entities.points.D2.meta;

import ua.sumdu.edu.entities.points.Point;

public class Point2D extends Point {
    public Point2D(double x, double y) {
        coordinates.put("x", x);
        coordinates.put("y", y);
    }

    @Override
    public double get(String axis) {
        Double result = coordinates.get(axis);
        if (result == null) {
            throw new IllegalStateException();
        } else {
            return result;
        }
    }
}