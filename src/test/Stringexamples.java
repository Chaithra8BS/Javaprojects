package test;

public class Stringexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shivam";
		String name1 = "John is from the US";
		
		System.out.println("Numb of chars in the string is " + name.length());
		System.out.println("Numb of chars in the string is " + name1.length());
		//6th char
		System.out.println("Fourth chars in the string is " + name1.charAt(5));
		//last char in a string: fun inside fun usage here
		System.out.println("Last chars in the string is " + name1.charAt(name1.length()-1));
		//convert to uppercase
		System.out.println("The string in Uppercase : " + name1.toUpperCase());

	}

}
