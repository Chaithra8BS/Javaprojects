package test;

import java.util.Arrays;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,7,3,8,9,2,5};
		//Sorting array
		Arrays.sort(arr);//sort the array value
		System.out.println("Sorted order is :" + Arrays.toString(arr));//shows all items on same line
		for(int val:arr)//shows on each line
		{
			System.out.println("each vale :"+val);
		}
		
		//Sum the values of array
		int sum=0;
		int len = arr.length;
		for(int i=0;i<len;i++)
		{
			sum = sum+arr[i];
			
			
		}
		System.out.println("Sum :"+sum);

	}

}
