/*c. Declare a method-local variable strStatus of type String with the value "true" and convert it to a boolean using the parseBoolean method.
 *  (Hint: Use Boolean.parseBoolean(String)).*/


package javaprogram;

public class program_2 {
	public static void main (String[ ] args) 
    { 
        String strstatus = "true"; 
  
        boolean status = Boolean.parseBoolean(strstatus);
        
        System.out.println("Boolean Value : " + status); 
    } 
} 


