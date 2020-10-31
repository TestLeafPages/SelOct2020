package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		Set<Integer> values = new LinkedHashSet<Integer>();

		// method to add values
		values.add(200);
		System.out.println(values.add(500));
		values.add(100);
		values.add(400);
		values.add(300);
		values.add(600);
		System.out.println(values.add(500));

		/*
		 * List<Integer> listValues = new ArrayList<Integer>(values);
		 * 
		 * System.out.println(listValues.get(2));
		 */

		for (Integer eachValue : values) {

			System.out.println(eachValue);

		}

	}

}
