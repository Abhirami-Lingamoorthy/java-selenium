package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//Declare
		String test = "change me"; 	
		
	//change to charArray
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		
	//traverse through each character
		for(int i = 0; i<charArray.length; i++)
		{
			if(i%2!=0)
  {
				// to uppercase the word odd index
			charArray[i] = Character.toUpperCase(charArray[i]);
			 System.out.println(charArray[i]);
}
		}
	}}
