/*Declare a method-local variable strStatus of type String with the value "true" and convert it to the corresponding wrapper class using Boolean.valueOf(). 
 * (Hint: Use Boolean.valueOf(String)).*/
package javaprogram;
public class program_5 {

	public static void main (String[] args) {
	String strStatus = "True";
	Boolean statusWrapper = Boolean.valueOf(strStatus);

    System.out.println("Boolean Wrapper Value: " + statusWrapper);
		}

	}


