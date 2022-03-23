package week1.day2;

public class Factorial1 {
	
	
	public static void main(String[] args) {
		
		int input = 5;
		
		int fact = 1;
		
		System.out.println("the factorial variable is =");
		
		for (int i = input; i >=1; i--) 
		{
			fact = fact*i;
			
		}
		System.out.println(fact);
	}

}
