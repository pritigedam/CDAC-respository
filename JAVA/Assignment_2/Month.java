/*4)Write a program that takes a month (1-12) and prints the corresponding season (Winter, Spring, Summer, Autumn) using a switch case
*/
import java.util.Scanner; 
class Month{

	public static void main(String[] args)
 {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Number of month:" );
	int mon= sc.nextInt();
	switch (mon) {
	case 1:
	System.out.println("January:" );
	System.out.println("Winter");
	break;

	case 2:
	System.out.println("February:" );
	System.out.println("Winter");
	break; 

	case 3:
	System.out.println("March:" );
	System.out.println("Spring");
	break;

	case 4:
	System.out.println("April:" );
	System.out.println("Spring");
	break;

	case 5:
	System.out.println("May:" );
	System.out.println("Spring");
	break;

	case 6:
	System.out.println("June:" );
	System.out.println("Summer");
	break;

	case 7:
	System.out.println("July:" );
	System.out.println("Summer");
	break;

	case 8:
	System.out.println("August:" );
	System.out.println("Rainy");
	break;

	case 9:
	System.out.println("September:" );
	System.out.println("Autumn");
	break;

	case 10:
	System.out.println("Octomber:" );
	System.out.println("Autumn");
	break;

	case 11:
	System.out.println("November:" );
	System.out.println("Winter");
	break;

	case 12:
	System.out.println("December:" );
	System.out.println("Winter");
	break;

	case 13:
	System.out.println("Invalid input:" );
	break;
		}
	}
}
