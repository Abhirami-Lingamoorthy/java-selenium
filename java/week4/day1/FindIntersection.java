package week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		int[] test = {3,2,11,4,6,7};
		int[] test2 = {1,2,8,4,9,7};
		Set<Integer>number = new LinkedHashSet<Integer>();
		Set<Integer>number2 = new LinkedHashSet<Integer>();
		
		
		if(test.length==test2.length) {

			for(int i =0; i<test2.length; i++) {
				
				number2.add(test2[i]); // test values added to the number
				number.add(test[i]); //test2 values added to the number
			
		
	}
			number.retainAll(number2);
			System.out.println(number);
			number2.removeAll(number);
			System.out.println(number2);

}}}
