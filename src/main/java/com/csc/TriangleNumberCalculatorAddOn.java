package com.csc;

public class TriangleNumberCalculatorAddOn {

    // Method to calculate the triangular number for a given n
    public int value(int n) {
        if (n < 1) throw new IllegalArgumentException("n must be a positive integer");
        if (n == 1) return 1;
        return n + value(n - 1);
    }

    // Add-on: Sum of two triangular numbers
    public int sumTwoTriangularNumbers(int n1, int n2) {
        return value(n1) + value(n2);
    }

    // Add-on: Subtract two triangular numbers
    public int subtractTwoTriangularNumbers(int n1, int n2) {
        return value(n1) - value(n2);
    }

    public static void main(String[] args) {
        TriangleNumberCalculatorAddOn calculator = new TriangleNumberCalculatorAddOn();
        int sum = calculator.sumTwoTriangularNumbers(3, 5);
        System.out.println("Sum of two triangular numbers: " + sum);  // Expected output: 21
    }
}
    