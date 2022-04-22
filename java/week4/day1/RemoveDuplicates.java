package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		List<String> removeDup=new ArrayList<String>();
		
		String[] split = text.split(" ");
		
		removeDup.add(text);
	
		for(int i = 0;i<split.length; i++) {
			
				
				for(int j = i+1; j<split.length; j++) {
				
				if(split[i].equals(split[j]))  {
					
					split[j] = " ";
					}
			}
				
				System.out.print(split[i]);
				count++;
				
			}
				
			
			
		}}
	
		
		

