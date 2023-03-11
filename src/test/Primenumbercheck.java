package test;

public class Primenumbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		boolean flag = true;//consider is a prime
		//divid the number from 1 untill the (same number-1)
		for(int i=2;i<num;i++)
		{
		int reminder=num%i;//find reminder
		if(reminder == 0)//is a non prime
		{
		flag = false; //is a non prime
		break;
		}}
		
		if(flag == true) //is a  prime
		{
		System.out.println("the number is a Prime number");
		}
		else
		{
			System.out.println("the number is not a Prime number");	
		}

	}

}
