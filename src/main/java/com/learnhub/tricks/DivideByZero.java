package com.learnhub.tricks;

public class DivideByZero {

    private static Double divide(Double first, Double second) {
        return first / second;
    }

    public static void main(String[] args) {
        System.out.println(divide(1.0, 0.0));
    }
}
