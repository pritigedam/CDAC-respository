//Declare a method-local variable number of type short with some value and convert it to the corresponding wrapper class using Short.valueOf().
//(Hint: Use Short.valueOf(short)).


package javaprogram;
public class program_12 {

	public static void main(String[] args) {
   // Declare a byte variable with some value
		        byte number = 42;

		        // Convert the byte to the corresponding wrapper class using Byte.valueOf(byte)
		        Byte numberWrapper = Byte.valueOf(number);

		        // Print the wrapper class value
		        System.out.println("Byte wrapper value: " + numberWrapper);
		    }
		
	}


	