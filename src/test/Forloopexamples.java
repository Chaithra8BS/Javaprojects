package test;

public class Forloopexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=1;num<11;num++)
		{System.out.println("Number with increment : " + num);
		}
		System.out.println("End of loop");
		//10 to 1
		for(int num1=10;num1>0;num1--)
		{System.out.println("Number with decrement : " + num1);
		}
		System.out.println("End of loop");
		
		//10 to 1 decrement by 2, use num1=num1-2
		for(int num1=10;num1>0;num1-=2)
		{System.out.println("Number with decrement : " + num1);
		}
		System.out.println("End of loop");
		
		//table of 2
		int num = 2;
		System.out.println("Start of table 2");
		
		for(int i=1;i<11;i++)
		{
			System.out.println(num*i);
			System.out.printf("%d * %d = %d",num,i, num*2);
		}
		System.out.println("End of table 2");
		
		
		//elements on array
		int arr[]= {2,3,4,5,8,9};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element values in array "+arr[i]);
		}
		
		//for each loop used only for arrays
		for(int val:arr)
		{System.out.println("value is "+val);
		}
		
		String str1 = "John";
		for(int i=0;i<str1.length();i++)
		{
			System.out.println("character values: " + str1.charAt(i));
		}
		
		
		
		

	}

}
