package collections;

import java.util.HashMap;

public class Mapexample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> basket = new HashMap<String,Integer>();
		basket.put("item1", 1);
		basket.put("item2", 2);
		basket.put("item3", 3);
		basket.put("item4", 3);//value can be duplicated, but not the key.
		System.out.println("The map is "+ basket);
		
		basket.put("item3", 4);//updates the value of the key
		System.out.println("The map is "+ basket);
		
		//So key acts as a Set and value acts as a list.
		basket.remove("item2");
		System.out.println("The map is "+ basket);
		
		//iterate over the elements using keys
		for(String item:basket.keySet())
		{//return s the set of all the keys
			System.out.println("Item name is "+ item);
		    System.out.println("Item quantity is " + basket.get(item));
		    }
		//iterate over the elements using value
		for(Integer val: basket.values()) {
			System.out.println("The value is "+val);
		}
			
		String str ="Clean World Green World Happy World";
		//find occurance of each word
		
		String arr1[] = str.split(" ");
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		for(String word:arr1) 
		{
			if(!map1.keySet().contains(word)) {
				map1.put(word, 1);
			}
			else
			{
				map1.put(word, map1.get(word)+1);
			}			
			
		}
		System.out.println("The resulting map is "+ map1);
		
		
		
	}

}
