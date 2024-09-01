class Student2Q1 {
	public static void main(String args[])
	 {
	Scanner reader = new Scanner(System.in);
	System.out.print("Enter a student id:");
	int student_id= reader.nextInt();

	if(student_id >=90)
	System.out.println("A");

	elseif(student_id <80 && student_id >=89);
	System.out.println("B");

	elseif(student_id <70 && student_id >=79);
	System.out.println("C");

	elseif(student_id <70 && student_id >=79);
	System.out.println("D");

	elseif(student_id >70);
	System.out.println("F");
 }
		}