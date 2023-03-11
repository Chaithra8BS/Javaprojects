package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse string
		String str = "MOM";
		String result = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println("Reverse string is : "+str.charAt(i));
			result = result + str.charAt(i);
			System.out.println("Reverse string is on result variable:" + result);
			
		}
		System.out.println("pal : " + result);
		
		//palindrome check
		
		if(result.equalsIgnoreCase(str))
		{
			System.out.println("The Given string is palindrome "+ result);
		}
		else			
		{
			System.out.println("The given word is not palindrome");
		
		}
		//==========================================================
		//change to Krishna meets Ram/ swap the words/not reverse
		
		String str1 = "Ram meets Krishna";
		    //Array to store the words
		String arr[] = str1.split(" ");//it stores ram,meets,krishna in an array
		String res = "";//use variable for store
		
		for(int i=arr.length-1;i>=0;i--)
		{
			res = res+arr[i]+ " ";
			System.out.println("the result is "+res.trim());
		}

	}

}
