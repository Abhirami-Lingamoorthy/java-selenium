package week3.day1;

public class FindTypes {

	public static void main(String[] args) {
		// Declare String
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		//declare data types
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
	// string to char array
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		
		// using loop
		for(int i=0; i<charArray.length; i++)
		{
			if( Character.isLetter(charArray[i])) {
				letter+=1;
				 System.out.println("letter: " + letter);
				
			}
			else if (Character.isDigit(charArray[i])) {
				num+=1;
				System.out.println("number: " + num);
			}
			else if (Character.isSpaceChar(charArray[i])) {
				 space+=1;
				System.out.println("space:" + space);
			}
			else {
				specialChar+=1;
				System.out.println("specialCharcter: " + specialChar);
			}
				
		}
		}}


