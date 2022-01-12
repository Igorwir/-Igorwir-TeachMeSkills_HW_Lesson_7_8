package com.teachmeskills.lesson_7_8;

/**
 * Create a class that describes a vector in a three-dimensional coordinate system.
 */
public class ThreeDimensionalVector  {
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public ThreeDimensionalVector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public double lenghVector() {
        return Math.sqrt(x * x + y * y + z * z);//Length of vector
    }


    public double skalar(ThreeDimensionalVector vect) {
            return x * vect.x + y * vect.y + z * vect.z;

    }

    public ThreeDimensionalVector vectorAddition(ThreeDimensionalVector vector) {
        return new ThreeDimensionalVector(x + vector.x, y + vector.y, z + vector.z);
    }

    public ThreeDimensionalVector vectorDifference(ThreeDimensionalVector vector) {
        return new ThreeDimensionalVector(x - vector.x, y - vector.y, z - vector.z);
    }

    public static ThreeDimensionalVector[] num(int n) {
        ThreeDimensionalVector[] vec = new ThreeDimensionalVector[n];
        for (int i = 0; i < n; i++) {
            vec[i] = new ThreeDimensionalVector(Math.random(), Math.random(), Math.random());
        }
        return vec;
    }

    @Override
    public String toString() {
        return "ThreeDimensionalVector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
