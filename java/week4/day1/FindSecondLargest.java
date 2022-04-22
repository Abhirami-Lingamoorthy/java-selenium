package week4.day1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int [] data = {3,2,11,4,6,7};
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<=data.length-1; i++)
		{
			list.add(data[i]);
			Collections.sort(list);
		}
			
			System.out.print("Second Largest Number=" +list.get(data.length-2));
			}
	
	}



