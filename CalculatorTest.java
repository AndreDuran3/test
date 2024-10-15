package calc.test;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

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
	    int a = 1234;
	    int b = 5678;
	    int actual = calculator.add(a, b);
	 
	    int expected = 6912;
	 
	    assertEquals(expected, actual);
	}

	@Test
	void testSubtract() {
		Calculator calculator = new Calculator();
	    int a = 100;
	    int b = 10;
	    int actual = calculator.subtract(a, b);
	 
	    int expected = 90;
	 
	    assertEquals(expected, actual);
	}

	@Test
	void testfactorial(){
		Calculator calculator = new Calculator();
		int g = 5;
		int actual = calculator.factorial(g);
		int expected = 120;
		assertEquals(expected, actual);
	}

	@Test
	void testviceversa(){
		Calculator calculator = new Calculator();
		int h = 6;
		int actual = calculator.viceversa(h);
		int expected = -6; 
		assertEquals(expected,actual);
	}

	@Test
	void testsqare(){
		Calculator calculator = new Calculator();
		int lio = 5; 
		int actual = calculator.square(lio);
		int expected = 25; 
		assertEquals(expected, actual);
	}
	
	@Test
	void testsqrt(){
		Calculator calculator = new Calculator();
		int nueve = 25;
		int actual = calculator.sqrt(nueve);
		int expected = 5;
		assertEquals(expected, actual);
	}
}
