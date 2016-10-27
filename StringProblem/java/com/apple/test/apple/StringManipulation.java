package com.apple.test.apple;

public class StringManipulation {

	// Iterating through the String, one character at a time to remove all
	// instances of the given Character in the String
	public String iterate(String stringInput, Character charInput) {

		for (int i = 0; i < stringInput.length() - 1; i++) {

			if (stringInput.charAt(i) == charInput) {
				stringInput = stringInput.replace(stringInput.charAt(i), ' ');
			}

		}

		return stringInput;

	}

	// Using string function to solve the same problem in one line of code
	public String stringFunction(String stringInput, Character charInput) {
		
		stringInput = stringInput.replace(charInput, ' ');
		return stringInput;
		
	}
	
	/*public static void main(String [] args){
		
		String  stringInput = "Javaxisxaxprogrammingxlanguagex";
		char charInput = 'x';
		System.out.println(iterate(stringInput, charInput));
	}
*/
	
}
