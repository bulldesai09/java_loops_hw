/*Write a Java  Program that creates the table of given number using for loops. Sample Output:
2*1=2
2*2=4 and so on.
*/

public class question1
{

	public static void main(String[] args)
	{
		//first we need counter 
		int i=0;

		for(i=0;i<10;i++)
		{	int mul=2;
			mul=mul*(i+1);
			System.out.println(Integer.toString(i+1) + " * "+"2 = " + Integer.toString(mul) );

		}
	}
}