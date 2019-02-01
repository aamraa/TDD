package Converter.Main;

public class Converter {
	
	public double poundToKilo(double pounds){
	return pounds * 2.20458554;
	}
	    
	public double kiloToPound(double kilos) {
	return kilos / 2.20458554;
	}
	    
	public double cmToInch(double cm) {
	return cm / 2.54;
	}
	    
	public double inchToCm(double inch) {
	return inch * 2.54;
	}
	    
	public double cToF(double c) {
	return (c * 1.8) + 32;
	}
	    
	public double fToC(double f) {
	return (f - 32) / 1.8;
	}
}
