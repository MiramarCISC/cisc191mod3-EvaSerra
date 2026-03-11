package edu.sdccd.cisc191;

import java.util.Objects;

public class Triangle extends Shape implements Measurable {
    public String name;
    double height;
    double base;
    double hypotenuse;

    Triangle(String name, double height, double base, double hypotenuse) {
        super(name);
        this.height = height;
        this.base = base;
        this.hypotenuse = hypotenuse;
    }


    @Override
    public double area() {
        //Formula: base * height/2
        return (base * height) / 2;
    }

    @Override
    double perimeter() {
        //We assume it's a right triangle for convenience purposes
        //Formula: Leg + leg + hypotenuse.
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return String.format("Triangle { name = '%s', perimeter = %f, area = % f}",
                getName(), perimeter(), area());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(height, triangle.height) == 0 &&
                Double.compare(base, triangle.base) == 0 &&
                Double.compare(hypotenuse, triangle.hypotenuse) == 0 &&
                Objects.equals(name, triangle.name);
    }
}
