package oop;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        BiFunction<Integer, Integer, Integer> y = (a, b) -> a*b;
//        System.out.println(y.apply(2, 3));

        Square squareOne = new Square(3);
        Square squareTwo = new Square(7);

        System.out.println(squareOne);
        System.out.println(squareTwo);

        Rectangle rectangleOne = new Rectangle(2, 3);
        Rectangle rectangleTwo = new Rectangle(4, 5);

        System.out.println(rectangleOne);
        System.out.println(rectangleTwo);

        Circle circleOldOne = new Circle(5);
        Circle circleOldTwo = new Circle(3);

        System.out.println(circleOldOne);
        System.out.println(circleOldTwo);

        RightAngleTriangle rightAngleTriangleOne = new RightAngleTriangle(5, 12);
        RightAngleTriangle rightAngleTriangleTwo = new RightAngleTriangle(3, 4);

        System.out.println(rightAngleTriangleOne);
        System.out.println(rightAngleTriangleTwo);

        List<GeomatricObject> objects = List.of(squareOne, squareTwo, rectangleOne, rectangleTwo, circleOldOne, circleOldTwo, rightAngleTriangleOne, rightAngleTriangleTwo);

        double sum = objects.stream()
                .mapToDouble(GeomatricObject::getArea) // Methodenreferenz Lambda-Expression
             // .mapTodouble(e -> e.getArea())         // Lambda-Expression
                .sum();
        System.out.println("Summe Flächeninhalt: " + sum);

        List<GeomObject2D> interfaceObjets = List.of(squareOne, squareTwo, rectangleOne, rectangleTwo, circleOldOne, circleOldTwo, rightAngleTriangleOne, rightAngleTriangleTwo);

        double sumPetimeter = objects.stream()
                .mapToDouble(GeomObject2D::getPerimeter) // Methodenreferenz Lambda-Expression
                .sum();
        System.out.println("Summe Umfang: " + sumPetimeter);
    }
}
