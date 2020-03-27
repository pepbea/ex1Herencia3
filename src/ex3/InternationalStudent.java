package ex3;

public class InternationalStudent extends Student
{
	private String country;
	
	//CONSTRUCTORA
	public InternationalStudent() {
		super();
		System.out.println("Soc el constructor de la classe InternationalStudent");
	}

	public InternationalStudent(String name, String address, String cycle, int course, String country) {
		super(name, address, cycle, course);
		System.out.println("Soc el constructor de la classe InternationalStudent");
		this.country = country;
	}

	//GETTERS & SETTERS
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
