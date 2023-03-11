package test;

public class NumbersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		//int sum = num1+num2;
		int sum = addition(num1, num2);
		System.out.println("The Result is:" + sum);

	}
	
	public static int addition(int a,int b) {
		return a+b;
	}
	
	public static int substrction(int a, int b) {
		return a-b;
	}

}
