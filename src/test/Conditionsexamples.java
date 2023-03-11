package test;

import java.util.Scanner;

public class Conditionsexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int age = 19;//hardcode input
		//dynami inputs
		int age;
		Scanner scanner = new Scanner(System.in);//dynamic input
		System.out.println("Enter the age ");
		
		age = scanner.nextInt();
				
		if(age<17)
		{
		System.out.println("You are not eligible for voting");
		}
		else if(age == 17) 
		{
		System.out.println("You will be eligible for voting next year");
		}
		else
		{
			System.out.println("Congratulations!!! You are elgible for voting");
		}
        scanner.close();
	}

}

