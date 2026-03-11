package edu.sdccd.cisc191;

import java.util.Objects;

public class Circle extends Shape implements Measurable {
    public String name;
    double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        //Formula: πr^2
        return (Math.pow(radius, 2)) * Math.PI;
    }

    @Override
    double perimeter() {
        //Formula: 2πr
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle { name = '%s', perimeter = %f, area = % f}",
                getName(), perimeter(), area());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 &&
                Objects.equals(name, circle.name);
    }
}
