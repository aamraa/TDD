package Strings.Main;

public class Strings {
	public int stringLength(String words) {
		return words.length();
	}
	
	public String evenChars(String words) { 
		String even = "";
		for (int i = 1; i < words.length(); i += 2) {
			if (Character.isLetter(words.charAt(i))) {
				even+= words.charAt(i);
				}
			}
		return even;
		}
	
	public String oddChars(String words) {
		String odd = "";
		for (int i = 0; i < words.length(); i += 2) {
			if (Character.isLetter(words.charAt(i))) {
				odd += words.charAt(i);
				}
			}
		return odd;
		}
	
	public String upperCaseChars(String words) {
		String upper = "";
		for (int i = 0; i < words.length(); i++) {
			if (Character.isUpperCase(words.charAt(i))){
				upper += words.charAt(i);
			}
		}
		return upper;
		}

	public String lowerCaseChars(String words) {
		String lower = "";
		for (int i = 0; i < words.length(); i++) {
		    if (Character.isLowerCase(words.charAt(i))) {
			lower += words.charAt(i);
		    }
		}
		return lower;
	    }
	
	public String nonChars(String words) {
	    	String non = "";
	    	for (int i = 0; i < words.length(); i++) {
	    		if (!(Character.isLetter(words.charAt(i)))) {
	    			non += words.charAt(i);
		    }
		}
	    return non;
	    }
}
