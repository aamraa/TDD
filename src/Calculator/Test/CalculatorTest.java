package Calculator.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Calculator.Main.Calculator;


public class CalculatorTest {
		
	Calculator calculator;
	double output;
	    
	@Before
	public void setUp() {
	calculator = new Calculator();
	}
	    
	
	@Test
	public void multiplicationTest() {
	output = calculator.multiplication(5, 5);
	assertEquals(25, output, 0);
	}

	@Test
	public void subtractionTest() {
	output = calculator.subtraction(15, 10);
	assertEquals(5, output, 0);
	}

	@Test
	public void divisionTest() {
	output  = calculator.division(50, 2);
	assertEquals(25, output , 0 );
	}

	@Test
	public void shouldReturnValueWhenSum() {
	output  = calculator.summation(5, 5);
	assertEquals(10, output, 0);
	}

}
