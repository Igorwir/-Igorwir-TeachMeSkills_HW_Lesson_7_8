package com.teachmeskills.lesson_7_8;

/**
 * Create a class that describes a vector in a two-dimensional coordinate system.
 */

public class TwoDimensionalVector extends Runer {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public TwoDimensionalVector(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double lenghVector() {
        return Math.sqrt(x * x + y * y);
    }

    public double skalar(TwoDimensionalVector vector) {
        return x * vector.x + y * vector.y;
    }

    public TwoDimensionalVector vectorAddition(TwoDimensionalVector vector) {
        return new TwoDimensionalVector(x + vector.x, y + vector.y);
    }

    public TwoDimensionalVector vectorDifference(TwoDimensionalVector vector) {
        return new TwoDimensionalVector(x - vector.x, y - vector.y);
    }

    public static TwoDimensionalVector[] num2(int n) {
        TwoDimensionalVector[] vec2 = new TwoDimensionalVector[n];
        for (int i = 0; i < n; i++) {
            vec2[i] = new TwoDimensionalVector(Math.random(), Math.random());
        }
        return vec2;
    }

    @Override
    public String toString() {
        return "TwoDimensionalVector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
