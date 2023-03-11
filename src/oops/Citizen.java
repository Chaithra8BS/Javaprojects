package oops;

public class Citizen extends Person{
	//person is parent and citizen is child class
	public int SSN;
	//default constructor
	public Citizen()
	{
		System.out.println("Inside default constructor of Citizen");
	}
	//parameterised constructor
	public Citizen (String Name, int age, String countryname, int SSN)
	{
		super();//calls the default constructor of Person class
		System.out.println("Inside parametrised constructor");
		this.Name = Name;
		this.age = age;
		this.countryname = countryname;
		this.SSN =SSN;
		System.out.println("Name" + Name);
		System.out.println("Age" + age);
		System.out.println("Country" + countryname);
		
	}
	
	public void Print()
	{
		System.out.println("print method of citizen-> SSN: " +SSN);
	}

}
