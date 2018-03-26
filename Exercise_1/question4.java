import java.util.Scanner;

public class question4{
	public static void main(String[] args){
		int factorial=1;
		int n=0;
		System.out.println("Enter number you want factorial of \n");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();

		for(int j=1;j<=n;j++){
			factorial=factorial*j;

		}
		System.out.println(factorial);
	}
}