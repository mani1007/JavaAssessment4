package assessment4;

import java.util.ArrayList;
import java.util.Arrays;

public class ListofList {

	public static void main(String[] args) {
		
		// Task 5
		
		ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(11,22,33));
		
		ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(9,19,29));
		
		ArrayList<Integer> list3= new ArrayList<>(Arrays.asList(7,17,27));
		
		System.out.println("Individual Lists:");
		
		System.out.println(list1);
		
		System.out.println(list2);
		
		System.out.println(list3);
		
		System.out.println("\nList of Lists:");
		
		ArrayList<ArrayList<Integer>> ll= new ArrayList<>();
		
		ll.add(list1);
		ll.add(list2);
		ll.add(list3);
		
		System.out.println(ll);

	}

}
