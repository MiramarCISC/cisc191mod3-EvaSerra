package edu.sdccd.cisc191;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public abstract class Shape implements Measurable, Comparable<Shape> {
    public String name;

    Shape(String name) {
        this.name = name;
    }


    abstract double perimeter();

    public String describe() {
        return String.format("This shape is called %s", getName());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s { name = '%s', perimeter = %f, area = % f}", getClass(), name, perimeter(), area());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(name, shape.name);
    }

    @Override
    public abstract double area();

    @Override
    public int compareTo(Shape other) {
        int areaCompare = Double.compare(this.area(), other.area());

        if (areaCompare != 0) return areaCompare;
        return this.getName().compareTo(other.getName());
    }
}

