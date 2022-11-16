package assessment4;

import java.util.ArrayList;

public class PrintSpecificElements {

	public static void main(String[] args) {
		
		//Task 4
		ArrayList<Integer> tech = new ArrayList<>();
						
		tech.add(10);
		tech.add(45);
		tech.add(90);
		tech.add(45);
		tech.add(23);
		tech.add(90);
		tech.add(44);
		
		System.out.println("Second Element of the List: "+tech.get(1));
		System.out.println("Second Last Element of the List: "+tech.get(tech.size()-2));

	}

}
