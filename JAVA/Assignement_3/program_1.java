package javaprogram;
/*b.Declare a method-local variable status of type boolean with the value true and convert it to a String using the toString method. 
 * (Hint: Use Boolean.toString(Boolean) ).*/


public class program {
	
	    public static void main (String[ ] args) 
	    { 
	        boolean value = true; 
	  
	        String statusString = Boolean.toString(value);
	        
	        System.out.println("Status as String: " +statusString); 
	    } 
	} 


