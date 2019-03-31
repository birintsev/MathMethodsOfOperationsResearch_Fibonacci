package ua.sumdu.edu.entities.points;

import java.util.HashMap;
import java.util.Map;

public abstract class Point {

    protected Map<String, Double> coordinates = new HashMap<>();
    private String name;

    public abstract double get(String axis);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(name != null ? name : "Point").append("(");
        for (Map.Entry<String, Double> entry : coordinates.entrySet()) {
            stringBuilder.append(entry.getKey()).append(";").append(entry.getValue());
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
