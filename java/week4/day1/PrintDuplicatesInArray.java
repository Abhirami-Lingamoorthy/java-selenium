package week4.day1;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	
		Set<Integer> Dup = new LinkedHashSet<Integer>();
		
		for(int i = 0; i<arr.length-1;i++) {
				
			Dup.add(arr[i]);
			
		for(int j=i+1; j<arr.length; j++) {
			Dup.add(arr[j]);
			
				if(arr[i]==arr[j])
			{
				
					System.out.print(arr[j]);
			
			}
				
		
		}
			
		}
		

	}

}
