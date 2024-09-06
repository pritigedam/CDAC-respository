/*2)Implement a program that calculates the Body Mass Index (BMI) based on height and weight input using if-else to classify the BMI int categories (underweight, normal weight, overweight,etc).
*/
import java.util.Scanner; 
class Bodymassindex{

	public static void main(String[] args)
 {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Age:" );
	int age= sc.nextInt();
	int bmi;
	bmi=weight/height;
	if(bmi<18.5)
	System.out.println("Category-1:Underweight" );
	else if(bmi<18.5 && bmi<=24.9) 
  	System.out.println("Category-2:Normal weight");
	else if(bmi<25 && bmi<=29.9) 
  	System.out.println("Class-1:Obesity-Overweight");
	else if(bmi<30 && bmi<=39.9) 
	System.out.println("Class-2:Obesity");
	else (bmi>40) 
	System.out.println("Class-3:Obesity");

	}

}