package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Ana");
		set1.add("Krish");
		set1.add("Ram");
		//adding Ran twice-> not allow to enter duplicates
		set1.add("Ram");
		set1.add("");
		set1.add(null);
		System.out.println("the  set elements "+set1);
		
		//Sort the set using TeeSet
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("Zen");
		set2.add("Mike");
		set2.add("Alice");
		
		System.out.println("The proper sorting order "+set2);
		
		//convert set in to a ist
		ArrayList<String> list1 = new ArrayList<String>(set1);
		System.out.println(list1);
		

	}

}
