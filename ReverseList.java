package assessment4;

import java.util.ArrayList;

public class ReverseList {

	public static void main(String[] args) {
		
		//Task 1
		ArrayList<String> tech = new ArrayList<>();
		
		tech.add("Java");
		tech.add("Selenium");
		tech.add("TestNG");
		tech.add("Git");
		tech.add("GitHub");
		
		for(int i=tech.size()-1;i>=0;i--)
			System.out.println(tech.get(i));

	}

}
