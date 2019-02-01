package Strings.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Strings.Main.Strings;

public class StringsTest {
	
	Strings words;
	String test = "soMe Test1/";
	String word;

	    @Before
	    public void setUp() {
		words = new Strings();
	    }

	    @Test
	    public void stringLengthTest() {
		int length = words.stringLength(test);
		assertEquals(11,length);
	    }
	    
	    @Test
	    public void evenCharsStringTest() {
		word= words.evenChars(test);
		assertEquals("oeTs", word);
	    }
	    @Test
	    public void oddCharsStringTest() {
		word= words.oddChars(test);
		assertEquals("sMet", word);
	    }
	    
	    @Test
	    public void upperCaseLettersStringTest() {
		word = words.upperCaseChars(test);
		assertEquals("MT", word);
	    }
	    
	    @Test
	    public void lowercaseLettersStringTest() {
		word = words.lowerCaseChars(test);
		assertEquals("soeest", word);
	    }
	    
	    @Test
	    public void noncharsStringTest() {
		word = words.nonChars(test);
		assertEquals(" 1/", word);
	    }
}
