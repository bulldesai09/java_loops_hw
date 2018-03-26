import java.util.Scanner;
/*writ program to print fbonacci series
 1 1 2 3 5 8 13 .....
*/
public class question5{
	public static void main(String[] args){
		int a=0;
		int b=1;
		int c=0;
		System.out.println("Enter N Upto Which You Want Me To Calculate Fibonacci Series ?");
		Scanner scan=new Scanner(System.in);
		int n=0;
		n=scan.nextInt();
		System.out.println("0"+"\n1");
		for(int i=0;i<n;i++){
			int temp=0;

			c=a+b;
			
			temp=b;
			b=c;
			a=temp;
			System.out.println(c);


		}

	}
}