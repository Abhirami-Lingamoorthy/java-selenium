package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int input =13;
		int flag = 0;
		
		for (int i = 2; i < input/2; i++)
		break;
			
		{
			
			if (input%2==0)
			{
			flag=0;	
			System.out.println(input+  "not a prime number");
			}
			if (input%2!=0) 
			{
			flag=1;
			System.out.println(input+ " prime number");
			}		
			
		}
}
	

}
