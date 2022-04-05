package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// create string value
		String text1 = "design";
		String text2 = "signed";
		
		// check the string length is equal using condition
		int length = text1.length();
		System.out.println(length);
		int length2 = text2.length();
		System.out.println(length2);
		
		if(length==length2)  {
			
			System.out.println("Length is equal");
		}
		else
		{
			System.out.println("Length is different");
		}
  
    // convert both string into character
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		
		// sort the array
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		// check both the array has same value
		if(Arrays.equals(charArray, charArray2));{
			System.out.println("ANAGRAM");
		}
		
		
		}

}
