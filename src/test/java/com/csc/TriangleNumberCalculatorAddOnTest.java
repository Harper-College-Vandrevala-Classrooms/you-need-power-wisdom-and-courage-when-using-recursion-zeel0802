package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangleNumberCalculatorAddOnTest {

    @Test
    public void testTriangularValue() {
        TriangleNumberCalculatorAddOn calculator = new TriangleNumberCalculatorAddOn();
        assertEquals(6, calculator.value(3), "The triangular number for 3 should be 6.");
        assertEquals(15, calculator.value(5), "The triangular number for 5 should be 15.");
    }

    @Test
    public void testSumTwoTriangularNumbers() {
        TriangleNumberCalculatorAddOn calculator = new TriangleNumberCalculatorAddOn();
        int result = calculator.sumTwoTriangularNumbers(3, 5);
        assertEquals(21, result, "The sum of triangular numbers for 3 and 5 should be 21.");
    }

    @Test
    public void testSubtractTwoTriangularNumbers() {
        TriangleNumberCalculatorAddOn calculator = new TriangleNumberCalculatorAddOn();
        int result = calculator.subtractTwoTriangularNumbers(5, 3);
        assertEquals(9, result, "The difference between triangular numbers for 5 and 3 should be 9.");
    }
}
