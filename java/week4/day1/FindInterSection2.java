package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindInterSection2 {

	public static void main(String[] args) {
	String [] list = {"cat", "rat", "mat", "rabbit", "vat"};
	String [] list2 = {"tiger","cat","lion", "vat", "monkey"};
	List<String> number = new ArrayList <String>();
	List<String> number2 = new ArrayList <String>();
	if(list.length==list2.length) {
		
		for(int i =0; i<list2.length; i++)
		{
			number.add(list[i]);
			number2.add(list2[i]);
			
		}
		number.retainAll(number2);
		System.out.println(number);
		number2.removeAll(number);
		System.out.println(number2);
	}
	

	}

}
