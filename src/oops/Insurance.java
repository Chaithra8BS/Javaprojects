package oops;

public class Insurance extends Citizen{
	//Insurance is child of Citzen and Citizen is child of Person
	public int InsuranceId;
	
	//default constructor
	public Insurance()
	{
		//super(); ->//parent classes constructors
		System.out.println("Inside default constructon on Insurance");
	}
	
	public void Displayinsurance()
	{
		System.out.println("Insurance id "+InsuranceId);
	}
	
	public void Print() {
		super.Print();//it calls the immediate parent
		System.out.println("insu id: "+InsuranceId);
		
	}

	public void Print(String message) {
		//super.Print();//it calls the immediate parent
		System.out.println("message:  "+message);
		
	}
	
	

}
