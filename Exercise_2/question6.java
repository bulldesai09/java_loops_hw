import java.util.*;
public class question6{
	public static void main(String[] args){
		int n=0;
	   
	   		
	   		for(n=0;n<100;n++){
	   		Formatter fmt = new Formatter();	
	   		fmt.format("%02d",n);
			System.out.println(fmt);
			fmt.close();
		}
	}
}