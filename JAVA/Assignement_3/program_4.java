/*Declare a method-local variable status of type boolean with the value true and convert it to the corresponding wrapper class using Boolean.valueOf(). 
 * (Hint: Use Boolean.valueOf(boolean)).*/
package javaprogram;

public class program_4 {

	public static void main(String[] args) {
		boolean status = true;
		Boolean statusWrapper = Boolean.valueOf(status);
	    System.out.println("Boolean Wrapper Value: " + statusWrapper);
	}
		

	}


