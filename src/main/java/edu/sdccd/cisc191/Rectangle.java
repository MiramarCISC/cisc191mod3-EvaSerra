package edu.sdccd.cisc191;

import java.util.Objects;

public class Rectangle extends Shape implements Measurable {
    public String name;
    double height;
    double width;

    Rectangle(String name, double height, double width) {
        super(name);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        //Formula: width * height
        return width * height;
    }

    @Override
    double perimeter() {
        //Formula: 2 * width + 2 * height
        return 2 * width + 2 * height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle { name = '%s', perimeter = %f, area = % f}",
                getName(), perimeter(), area());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(height, rectangle.height) == 0 &&
                Double.compare(width, rectangle.width) == 0 &&
                Objects.equals(name, rectangle.name);
    }
}
