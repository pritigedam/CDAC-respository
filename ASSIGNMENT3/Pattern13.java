class Pattern13
 {
public static void main(String args[])
  {
	for (int i=1; i<=5;i++)
  	{
	for(int j=1; j<=i;j++)
       {
	System.out.print(i+"*");
       }
	System.out.println(i);
     }
  for (int j=5; j>0;j--)
  	{
	for(int i=j-1; i>0;i--)
      {
	System.out.print(i+"*");
      }
	System.out.println(i);
    }
 }
}