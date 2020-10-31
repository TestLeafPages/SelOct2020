package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> values = new LinkedList<String>();

		// method to add values
		values.add("Hari"); // index for the first item is 0
		values.add("Naveen");
		values.add("Sam");
		values.add("Dhivya");
		values.add("Hari");
		values.add("Bowya"); // index for last item is always size()-1

		List<String> newValues = new LinkedList<String>(values);

		// to copy data from one collection to another collection
	//	newValues.addAll(values);
		newValues.add("Dani");

		// method to remove
		values.remove("Hari");

		// to get the size of the list
		System.out.println(values.size());

		// to get a single item from list
		// System.out.println(values.get(1));

		// to get the last item
		// System.out.println(values.get(values.size()-1));

		//to sort the values in List
		Collections.sort(newValues);
		
		for (String eachValue : newValues) {

			System.out.println(eachValue);

		}
		
		
		

		/*
		 * System.out.println("******************");
		 * 
		 * for (int i = values.size()-1; i >=0; i--) {
		 * 
		 * System.out.println(values.get(i));
		 * 
		 * }
		 */

	}

}
