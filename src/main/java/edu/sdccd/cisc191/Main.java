
package edu.sdccd.cisc191;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //List Shape
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("A", 2));
        shapes.add(new Rectangle("B", 3, 4));
        shapes.add(new Triangle("C", 3, 4, 5));

        //Polymorphic Loop
        for (Shape s : shapes) {
            System.out.println(s.describe() + " area=" + s.area());
        }

        //Sorting by area
        shapes.sort(Comparator.comparingDouble(Shape::area));
        System.out.println("\nSorted by area:");
        shapes.forEach(System.out::println);

        //Equals Comparison
        System.out.println("\nEquals demonstration:");
        Circle a = new Circle("same",2);
        Circle b = new Circle("same",2);
        System.out.println(a.equals(b));


    }
}
