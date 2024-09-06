/*5)Write a program that allows the user to select a shape (Circle, Square, Rectangle, Triangle) and then calculates the area based on user-provided dimensions using a switch case.
*/
import java.util.Scanner; 
public class area{

	public static void main(String[] args)
	 {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a shape:" );
	int shape= sc.nextInt();
	switch (shape) {
	case 1:
	System.out.println("Enter radius:" );
	int r = sc.nextInt();
	double pi = 3.142,areacir;
	areacir = pi * r * r;
	System.out.println("Area of Circle:"+areacir );
	
	break;

	case 2:
	System.out.println("Enter side :" );
	int s = sc.nextInt();
	int areasq;
	areasq=s*s;
	System.out.println("Area of Square:"+areasq);
	break; 

	case 3:
	System.out.println("Enter length :" );
	int l = sc.nextInt();
	System.out.println("Enter breadth :" );
	int b = sc.nextInt();
	int arearec;
	arearec = l*b;
	System.out.println("Area of Rectangle:"+arearec);
	break;

	case 4:
	System.out.println("Enter base :" );
	int b1 = sc.nextInt();
	System.out.println("Enter height :" );
	int h = sc.nextInt();
	int areatri;
	areatri=b1*h;
	System.out.println("Area of Rectangle:"+areatri);
	break;

	case 5:
	System.out.println("Invalid input:" );
	break;
	    }
	  }
      }	