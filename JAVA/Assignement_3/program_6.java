/*g. Experiment with converting a boolean value into other primitive types or vice versa and observe the results.*/
package javaprogram;
public class program_6 {

	public static void main(String[] args) {
	

	        // 1. Convert boolean to other primitive types (using conditional expressions)
	        boolean boolValue = true;

	        // Convert boolean to int (1 for true, 0 for false)
	        int intValue = boolValue ? 1 : 0;
	        System.out.println("Boolean to int: " + intValue);

	        // Convert boolean to double (1.0 for true, 0.0 for false)
	        double doubleValue = boolValue ? 1.0 : 0.0;
	        System.out.println("Boolean to double: " + doubleValue);

	        // 2. Convert primitive types to boolean (using comparison)
	        int numValue = 5;

	        // Any non-zero number can be considered as true, 0 as false
	        boolean boolFromInt = numValue != 0;
	        System.out.println("int to boolean: " + boolFromInt);

	        
	        // 3. Converting boolean to String
	        String boolToString = Boolean.toString(boolValue);
	        System.out.println("Boolean to String: " + boolToString);
	    }
	}


