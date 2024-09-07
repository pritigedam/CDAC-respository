/*Declare a method-local variable strStatus of type String with the value "1" or "0" and attempt to convert it to a boolean.
 *  (Hint: parseBoolean method will not work as expected with "1" or "0").*/
package javaprogram;

public class program_3 {

	public static void main(String[] args) {
		String strStatus = "1"; 
		 boolean status;
		    if (strStatus.equals("1")) {
		        status = true;
		    } else if (strStatus.equals("0")) {
		        status = false;
		    } else {
		        status = Boolean.parseBoolean(strStatus); // fallback for "true" or "false" strings
		    }

		    System.out.println("Boolean Value: " + status);
		}

	}


