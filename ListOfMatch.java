package assessment4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOfMatch {

	public static void main(String[] args) {
		
		//Task 2
		ArrayList<String> tech = new ArrayList<>();
				
		tech.add("Git");
		tech.add("GitHub");
		tech.add("GitLab");
		tech.add("GitBash");
		tech.add("Selenium");
		tech.add("Java");
		tech.add("Maven");
		
		ArrayList<String> tech2=new ArrayList<>();
		
		Iterator<String> it = tech.iterator();
		
		while(it.hasNext())
		{
			String temp = it.next();
			if(temp.startsWith("Git"))
				tech2.add(temp);
		}
		
		System.out.println(tech2);

	}

}
