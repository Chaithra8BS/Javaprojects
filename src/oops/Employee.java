package oops;

public class Employee {
	
	//properties
	public String Name;
	public int Empid;
	private static int Salary = 200000000;
	public static int Salary1 = 90;
	//it is not public ,not disclosed to all
	//It is static which is common across all objects
	
	//constructor means which has name same as class and no return value(no void)
	//This is default constructor
	public Employee()
	{
		System.out.println("Inside default contrustor");
	}
	
	//this is parameterized constructor
	public Employee(String var1, int var2)
	{
		System.out.println("Inside parameterized contructor");
		//we can use this.Name = var1
	Name = var1;
	Empid = var2;
	}		
	
	//Function
	public void DisplayName()
	{
	System.out.println("Name of the Employee is: "+Name);
	System.out.println("Id of the Employee is: "+Empid);
}
	
	public static void Displaysalary()
	{
		System.out.println(" The salary "+Salary);
	}
	
	public static void Displaysalary1()
	{
		System.out.println(" The salary1 "+Salary1);
	}
}
