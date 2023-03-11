package test;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,20,30,40,50,60};
		System.out.println("The length of array is : "+ arr1.length);
		System.out.println("First value of array is "+ arr1[1]);
		System.out.println("Last value of array is "+ arr1[arr1.length-1]);
		System.out.println("All the values inside the array use loops");
		
		String[] arr2 = {"Mon","Tue","Wed","Thur","Fri","Sat","Sun"};
		System.out.println("The value at 3rd position is "+arr2[2]);
		
		//Number of words present
		String str = "Clean World Green World";
		String arr3[] = str.split(" "); //the words are separated as per the space btw the words and 
		//this will store {clean,world,green,world}
		System.out.println("The number of words in the given statement is : "+arr3.length);
		
		

	}

}
