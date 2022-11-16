package assessment4;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//Task 3
		ArrayList<String> tech = new ArrayList<>();
				
		tech.add("Java");
		tech.add("TestNG");
		tech.add("Maven");
		tech.add("Java");
		tech.add("TestNG");
		tech.add("Maven");
		tech.add("Cucumber");
		tech.add("Jenkins");
		
		
		ArrayList<String> tech2 = new ArrayList<>();
		
		for(String value:tech)
			if(tech2.contains(value))
				continue;
			else
				tech2.add(value);
		System.out.println(tech2);

	}

}
