package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    /* Tests for division */
    @Test
    public void shouldDividePositives() {

        assertEquals(3, calc.divide(6,2));
        assertEquals(2, calc.divide(80, 39));
        assertEquals(1, calc.divide(105, 100));
    }

    @Test
    public void shouldDivideNegatives() {

        assertEquals(3, calc.divide(-6,-2));
        assertEquals(2, calc.divide(-80, -39));
        assertEquals(1, calc.divide(-105, -100));
    }

    @Test
    public void shouldDivideBothPosAndNeg() {
        assertEquals(-3, calc.divide(6,-2));
        assertEquals(-2, calc.divide(-80, 39));
        assertEquals(-1, calc.divide(105, -100));
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, calc.divide(0,0));
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(105, 0));
    }

    /* Tests for addition */
    @Test
    public void shouldAddTwoPositiveIntegers() {
        assertEquals(10, calc.add(5, 5));
        assertEquals(10, calc.add(8, 2));
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    public void shouldAddTwoNegativeIntegers() {
        assertEquals(-12, calc.add(-10, -2));
        assertEquals(-4, calc.add(-2, -2));
        assertEquals(-10, calc.add(-5, -5));
    }

    @Test
    public void shouldReturnEnteredNonZeroInteger() {
        assertEquals(10, calc.add(10, 0));
        assertEquals(12, calc.add(12, 0));
        assertEquals(15, calc.add(15, 0));
    }

    @Test
    public void shouldAddAPositiveAndNegativeInteger() {
        assertEquals(10, calc.add(12, -2));
        assertEquals(12, calc.add(14, -2));
        assertEquals(15, calc.add(20, -5));
    }

    /* Tests for multiplication */
    @Test
    public void shouldMultiplyTwoPositiveIntegers() {
        assertEquals(25, calc.multiply(5, 5));
        assertEquals(16, calc.multiply(8, 2));
        assertEquals(10, calc.multiply(2, 5));
    }

    @Test
    public void shouldMultiplyTwoNegativeIntegers() {
        assertEquals(25, calc.multiply(-5, -5));
        assertEquals(16, calc.multiply(-8, -2));
        assertEquals(10, calc.multiply(-2, -5));
    }

    @Test
    public void shouldReturnZeroInteger() {
        assertEquals(0, calc.multiply(5, 0));
        assertEquals(0, calc.multiply(2, 0));
        assertEquals(0, calc.multiply(10, 0));
    }

    @Test
    public void shouldMultiplyPositiveAndNegativeIntegers() {
        assertEquals(-25, calc.multiply(-5, 5));
        assertEquals(-16, calc.multiply(-8, 2));
        assertEquals(-10, calc.multiply(-2, 5));
    }

    /* Tests for subtraction */
    @Test
    public void shouldSubtractTwoPositiveIntegers() {
        assertEquals(0, calc.subtract(5, 5));
        assertEquals(6, calc.subtract(8, 2));
        assertEquals(-3, calc.subtract(2, 5));
    }

    @Test
    public void shouldSubtractTwoNegativeIntegers() {
        assertEquals(0, calc.subtract(-5, -5));
        assertEquals(-6, calc.subtract(-8, -2));
        assertEquals(3, calc.subtract(-2, -5));
    }

    @Test
    public void shouldReturnNegativeEnteredNonZeroInteger() {
        assertEquals(-5, calc.subtract(0, 5));
        assertEquals(-2, calc.subtract(0, 2));
        assertEquals(-10, calc.subtract(0, 10));
    }

    @Test
    public void shouldReturnPositiveEnteredNonZeroInteger() {
        assertEquals(5, calc.subtract(5, 0));
        assertEquals(2, calc.subtract(2, 0));
        assertEquals(10, calc.subtract(10, 0));
    }

    @Test
    public void shouldSubtractNegativeAndPositiveInteger() {
        assertEquals(-10, calc.subtract(-5, 5));
        assertEquals(-10, calc.subtract(-8, 2));
        assertEquals(-7, calc.subtract(-2, 5));
    }

    @Test
    public void shouldSubtractAPositiveAndNegativeInteger() {
        assertEquals(10, calc.subtract(5, -5));
        assertEquals(10, calc.subtract(8, -2));
        assertEquals(7, calc.subtract(2, -5));
    }
}
