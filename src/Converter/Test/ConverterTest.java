 package Converter.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Converter.Main.Converter;

public class ConverterTest {

	Converter converter;
	double output;
	
	@Before
	public void setUp() {
		converter = new Converter();
	}
	
	@Test
	public void poundToKiloTest() {
		output = converter.poundToKilo(3);
		assertEquals(6.61375662, output, 0);
	}
	
	@Test
	public void kiloToPoundTest() {
		output = converter.kiloToPound(6.61375662);
		assertEquals(3, output, 0);
	}
	
	 @Test
	 public void InchToCmTest() {
		 output = converter.cmToInch(15);
		 assertEquals(5.9055, output, 1);
	 }

	 @Test
	 public void CmToInchTest() {
		 output = converter.inchToCm(2);
		 assertEquals(4.08, output, 1);
	 }

	 @Test
	 public void FToCTest() {
		 output = converter.cToF(5);
		 assertEquals(41, output, 0);
	 }

	 @Test
	 public void CToF() {
		 output = converter.fToC(41);
		 assertEquals(5, output, 0);
	 }

}
