package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		Integer [] array = {1,2,3,4,7,6,8};
		List<Integer>number = new ArrayList<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(7);
		number.add(6);
		number.add(8);
		Collections.sort(number);
		for(int i=0; i<number.size()-1; i++){
			if(number.get(i)!=i+1) {
				System.out.println("Missing number is ="+ (i+1));
				break;
			}
			
		}
		
			}
		
		

	}

