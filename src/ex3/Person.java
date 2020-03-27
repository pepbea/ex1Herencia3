package ex3;

public class Person 
{
	private String name;
	private String address;
	
	//CONSTRUCTOR
	public Person() {
		 System.out.println("Soc el constructor de la classe Person");
	}

	public Person(String name, String address) {
		System.out.println("Soc el constructor de la classe Person");
		this.name = name;
		this.address = address;
	}

	//GETTERS & SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
