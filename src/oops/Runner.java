package oops;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	//initializing the object for class Employee
		Employee emp1 = new Employee();
		emp1.Name = "Chaithra";
		emp1.Empid = 100;
		//calling the methods using the objects
		emp1.DisplayName();
		
		Employee emp2 = new Employee();
		emp2.Name = "Sharath";
		emp2.Empid = 101;
		emp2.DisplayName();
		
		//For parameterized constructor:
		Employee emp3 = new Employee("Lucky",103);
		emp3.DisplayName();
		Employee emp4 = new Employee("Lucky1",104);
		emp4.DisplayName();
		
		//Static to display salary for all
		Employee.Displaysalary();
		//since salary is private var not able to assign value here
		//as 
		Employee.Displaysalary1();
		Employee.Salary1 =300000000;
		Employee.Displaysalary1(); */
		
		//child class object initialization and using and adding valus for parent class variable
		System.out.println("****************** Creating ct1 obj");
		Citizen ct1 = new Citizen();
		ct1.Name = "Chaithra";
		ct1.age = 25;
		ct1.SSN =10;
		//ct1.country="ind"; //not working bcs it is private only for that ame class.
		ct1.countryname ="India";//protected keys will be used by parent and its child clases only
		ct1.Print();
		
		System.out.println("****************** Creating ct2 obj");
		Citizen ct2 = new Citizen("Chaithra",20,"India",123);
		ct2.Print();
		
		System.out.println("****************** Creating Insurance obj");
		Insurance insu = new Insurance();
		insu.InsuranceId = 20;
		insu.Displayinsurance();
		insu.SSN = 99;
		System.out.println("*********overloading");
		insu.Print();//overloading
		insu.Print("Hello overriding method");//overriding
		
		//can't initlise absract class
		//Bankexample bank = new Bankexample();
		
		//Can initilise only its child class
		CitiBank bank = new CitiBank();
		bank.Print();
		
		//Encapsulation example
		EncapsulationExample emp = new EncapsulationExample();
		emp.setSalary(500000000);
		System.out.println("The salary is " + emp.getSalary());

	}

}
