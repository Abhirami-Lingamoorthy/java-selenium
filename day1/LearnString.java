package week3.day1;

import org.apache.poi.util.SystemOutLogger;

public class LearnString {
	

	public static void main(String[] args) {
		String str = "java language";
		String str1 = "language";
		String str2 = new String("Welcome");
		String name = "   To Get the Index of Specific Value    ";
		System.out.println(str);
		System.out.println(str1);
		//compare the memory
		if(str==str1)
		{
			System.out.println("The string is same");
		}
		else {
			System.out.println("The String is not same");
		}
		//change string to character//get individual char from string
		char charAt = str.charAt(2);
		System.out.println(charAt);
		
		char charAt2 = str1.charAt(5);
		System.out.println(charAt2);
		
		//compare the string value
		System.out.println(str.equals(str1));
		
		//compare the string
		System.out.println(str.equalsIgnoreCase(str1));
		
		//find the string length in integer value
		
		int length = str.length();
		System.out.println(length);
		int length2 = str1.length();
		System.out.println(length2);    
		
		
		//convert string to array
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		System.out.println(charArray[length-2]);
		char[] charArray2 = str1.toCharArray();
		System.out.println(charArray2);
		//System.out.println(charArray2[length-2]);
		
		//convert string to character array
		char[] charArray3 = str.toCharArray();
        for(int i=0; i<charArray3.length; i++) {
        	
       System.out.println(charArray3[i]);
        }
        
       //to get indexOf specific character
        int indexOf = str1.indexOf('n');
        System.out.println(indexOf);
        
        // to get part of index
        String substring = str2.substring(2);
        System.out.println(substring);
        
        //  start and stop index
        System.out.println(str2.substring(2,6));
        
       // using trim
        String trim = str.trim();
        System.out.println(trim);
        String trim2 = name.trim();
        System.out.println(trim2);
		
       // split the string
         String[] split = name.split(trim2);
         System.out.println(split);
        // for(int i=0; i<split.length; i++) {
        	//System.out.println(split[i]); 
         
         // convert upper case & lower case
         System.out.println(name.toUpperCase()); 
         System.out.println(name.toLowerCase());
         
         // to replace
         String replace = name.replace("e","#");
         System.out.println(replace);
         
        // replace all
         //String replaceAll = name.replaceAll("[0-5]", "a");
         //System.out.println(replaceAll);
         
         // to add two strings
         String concat = str.concat(str2);
         System.out.println(concat);
         }
}




