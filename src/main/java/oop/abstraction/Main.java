package oop.abstraction;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(2, 3);

        List<Shape> shapes = List.of(circle, square, rectangle);
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + ": " + shape.getArea());

            if (shape instanceof WithDiagonal withDiagonal) {
                System.out.println("\tdiagonal length: " + withDiagonal.getDiagonalLength() + "; rounded: " + withDiagonal.getDiagonalLengthRounded());
            }
        }

//        Function<Integer, Integer> mapFunction = x -> x * x;

        Stream.of(4,2,6,7)
//                .map(mapFunction)
                .map(new MapFunction())
                .forEach(System.out::println); // x -> System.out.println(x);
    }

    private static class MapFunction implements Function<Integer, Integer> {

        @Override
        public Integer apply(Integer x) {
            return x * x;
        }
    }
}
