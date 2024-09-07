//Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a byte value. 
//(Hint: parseByte method will throw a NumberFormatException).package javaprogram;

package javaprogram;
public class program_11 {
public static void main(String[] args) {
        // Declare a String variable with non-numeric characters
        String strNumber = "Ab12Cd3";
        
        try {
            // Attempt to convert the String to a byte value using Byte.parseByte(String)
            byte number = Byte.parseByte(strNumber);
            System.out.println("String converted to byte: " + number);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException if the String is not a valid byte
            System.out.println("Error: The string \"" + strNumber + "\" is not a valid byte value.");
        }
    }
	
	
}


