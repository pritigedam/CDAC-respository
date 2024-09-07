//Declare a method-local variable strNumber of type String with some value and convert it to a byte value using the parseByte method. *\
//(Hint: Use Byte.parseByte(String)).
 
package javaprogram;
public class program_10 {
public static void main(String args[]) {

    String strNumber = "100";

    // Convert the String to a byte value using Byte.parseByte(String)
    byte number = Byte.parseByte(strNumber);

 
    System.out.println("String converted to byte: " + number);
}

}
