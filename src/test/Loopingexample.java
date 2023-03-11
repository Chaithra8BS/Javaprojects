package test;

public class Loopingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Loops are used to do repetitive work on multiple values
		//print 1 to 10 using while loop
		
		int num = 1;
		//int i = num++;
		//int j = ++num;
		//System.out.println("i is " + i);
		//System.out.println("j is :" + j);

		
		while(num<11)
		{
		System.out.println(num);
		num = num + 1;
		//num++;
		}
		System.out.println("end of while loop");
		
		//decrement numbers
		int num1 = 10;
		
		while(num1>0)
		{
		System.out.println(num1);
		num1 = num1 - 1;
		//num1--;
		}
		System.out.println("end of while loop");
		
		// decerent all number 10 to 1 , but dont show 5
		int num2 = 10;
		while(num2>0)
		{
			if(num2==5)
			{System.out.println("Skip");
			num2--;
			continue;
			}
			System.out.println(num2);
			num2--;
		}
		System.out.println("end of while loop 3");
		
		//Stop the loop once u find the value
		int num3 = 10;
		while(num3>0)
		{
			if(num3==5)
			{System.out.println("Stop");
			num3--;
			break;
			}
			System.out.println(num3);
			num3--;
		}
		System.out.println("end of while loop 4");
		
		
	}

}
