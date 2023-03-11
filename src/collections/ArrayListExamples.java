package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"Jhon","Priya","smith"};
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("John");
		list1.add("Smith");
		list1.add("Priya");
		list1.add("Priya");
		list1.add("");
		list1.add(null);
		
		System.out.println("The list is : "+list1);
		System.out.println("The size of the list "+ list1.size());
		System.out.println("First name in the list "+ list1.get(0));
		System.out.println("Last name in the list "+ list1.get(list1.size()-1));
		
		list1.add(0, "Mike");//this will add the new entry before John
		System.out.println("The list after updating" + list1);
		
		// update the name John to Mike
		list1.set(1, "Mike");
		System.out.println("The list after updating" + list1);
		
		list1.remove(1);
		System.out.println("The list after updating" + list1);
		
		list1.add(0, "Zen");
		System.out.println("The list after updating" + list1);

		//iterate using for loop
		for(int i=0;i<list1.size();i++)
		{
			System.out.println("Elements :"+list1.get(i));
			
		}
		
		//iterarte using for each
		for(String value:list1)
		{
			System.out.println("Elements are "+value);
		}
		
		//iterate using Iterator
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext())
		{
			System.out.println("The list is "+ itr.next());
			
		}
		//Sorting the names
		Collections.sort(list1);
		System.out.println("after sorting the list "+list1);
		
		//reverse sorting the list
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("the descending  order "+ list1);
			
	}
	

}
