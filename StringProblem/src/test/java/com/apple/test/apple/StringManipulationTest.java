package com.apple.test.apple;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringManipulationTest {
	
	StringManipulation manipulation = new StringManipulation();
	String  stringInput = "Javaxisxaxprogrammingxlanguage";
	char charInput = 'x';
	// Test should pass
    @Test
	public void testStringManipulation1(){
    	
    	String expectedResult = "Java is a programming language";
    	String output = manipulation.iterate(stringInput, charInput);
    	assertEquals("String does not match",expectedResult, output);
		
    }
    // Test should pass
    @Test
   	public void testStringManipulation2(){
       	
       	String expectedResult = "Java is a programming language";
       	String output = manipulation.stringFunction(stringInput, charInput);
       	assertEquals("String does not match",expectedResult, output);
   		
       }
    
    // Negative test case
    @Test
    public void testStringManipulation3(){
    	
    	String expectedResult = "Java is a programming language";
    	charInput = 'z';
    	String output = manipulation.iterate(stringInput, charInput);
    	assertEquals("String does not match",expectedResult, output);
    	
    }
    

}
