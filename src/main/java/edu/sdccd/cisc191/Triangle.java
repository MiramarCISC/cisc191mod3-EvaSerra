package edu.sdccd.cisc191;

import java.util.Objects;

public class Triangle extends Shape implements Measurable {
    public String name;
    double height;
    double base;
    double hypotenuse;

    Triangle(String name, double height, double base, double hypotenuse) {
        super(name);

        if (height <= 0 || base <= 0 || hypotenuse <= 0) {
            throw new IllegalArgumentException("All sides must be bigger than 0");
        } else if (height >= hypotenuse || base >= hypotenuse) {
            throw new IllegalArgumentException("Hypotenuse must be the biggest side");
        } else if ( height + base <= hypotenuse ||
                    height + hypotenuse <= base ||
                    hypotenuse + base <= height
        ) {
            /*
            Triangle Inequality Theorem states that every side of a triangle must be smaller
            than the sum of the other 2.
            */
            throw new IllegalArgumentException("Side must be smaller than the sum of 2 sides");
        }

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
