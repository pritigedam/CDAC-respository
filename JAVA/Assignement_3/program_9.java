
/*Declare a method-local variable number of type byte with some value and convert it to a String using the toString method.(Hint: Use Byte.toString(byte)).*/

package javaprogram;
public class program_9 {

public static void main (String args[]) {
    byte number = 10; // Declare a byte variable with some value

  
    String numberAsString = Byte.toString(number);

    System.out.println("Byte as String: " + numberAsString);
}

}
