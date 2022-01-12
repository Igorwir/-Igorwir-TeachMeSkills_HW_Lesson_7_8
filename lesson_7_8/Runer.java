package com.teachmeskills.lesson_7_8;

import java.util.Arrays;

public class Runer {
    public static void main(String[] args) {
        ThreeDimensionalVector [] vector =  ThreeDimensionalVector.num(5);
        TwoDimensionalVector [] vectors = TwoDimensionalVector.num2(6);
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[0].skalar(vector[1]));
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].vectorAddition(vectors[1]));

    }
}
