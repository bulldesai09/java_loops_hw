/*Write a Java Program that prints all even numbers from 2 to 100
 inclusive. While printing these numbers after every multiple of 20,
it should start printing in new line.*/

public class question2{
	public static void main(String[] args){
		int j=0;
		for(j=0;j<100;j++){
			if(j%2==0){
				System.out.println(j+"\n");
			}
			if(j%20==0)
			{
				hundred();

			}

		}

	}

	public static void hundred()
	{
		int i=0 ;
		for(i=0;i<100;i++){
			if((i%20)==0)
		{
			System.out.print("\n");
		}
		System.out.print(i+1 +"\t");
		
	}
	}
}