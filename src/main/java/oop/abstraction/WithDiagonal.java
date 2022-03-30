package oop.abstraction;

public interface WithDiagonal {

    double getDiagonalLength();

    default double getDiagonalLengthRounded() {
        return Math.round(getDiagonalLength());
    }
}
