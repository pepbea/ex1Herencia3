package ex3;

public class Student extends Person
{
	private String cycle;
	private int course;

	//CONSTRUCTORA
	public Student()
	{
		super();
		System.out.println("Soc el constructor de la classe Student");
	}

	public Student(String name, String address, String cycle, int course) {
		super(name, address);
		System.out.println("Soc el constructor de la classe Student");
		this.cycle = cycle;
		this.course = course;
	}

	//GETTERS & SETTERS
	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
}
