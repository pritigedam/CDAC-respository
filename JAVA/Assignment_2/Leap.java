/*1)Write a program that checks if a given year is a leap year or not using both if-else and switch-case.
*/
import java.util.Scanner; 
class Leap{

	public static void main(String[] args)
 {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Year:" );
	int year= sc.nextInt();

	if(year%4==0)
	System.out.println("The given year is Leap Year" );
	
	else
	System.out.println("The given year is not Leap Year");

}
}

