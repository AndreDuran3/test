package calc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest2 {

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 3;
        int actual = calculator.add(a, b);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 3;
        int actual = calculator.subtract(a, b);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void testFactorial() {
        Calculator calculator = new Calculator();
        int n = 5;
        int actual = calculator.factorial(n);
        int expected = 120;
        assertEquals(expected, actual);
    }

    @Test
    void testViceversa() {
        Calculator calculator = new Calculator();
        int a = -10;
        int actual = calculator.viceversa(a);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void testSquare() {
        Calculator calculator = new Calculator();
        int p = 4;
        int actual = calculator.square(p);
        int expected = 16;
        assertEquals(expected, actual);
    }

    @Test
    void testSqrt() {
        Calculator calculator = new Calculator();
        int f = 16;
        int actual = calculator.sqrt(f);
        int expected = 4;
        assertEquals(expected, actual);
    }
}

