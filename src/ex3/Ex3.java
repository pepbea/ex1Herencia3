package ex3;

public class Ex3 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		System.out.println("\n------------ CONSTRUCTORS ------------ ");
		System.out.println("\nPERSON");
		System.out.println("-------------------------");
		Person person = new Person();
		
		System.out.println("\nTEACHER");
		System.out.println("-------------------------");
		Teacher teacher = new Teacher();
		
		System.out.println("\nSTUDENT");
		System.out.println("-------------------------");
		Student student = new Student();
		
		System.out.println("\nINTERNATIONAL STUDENT");
		System.out.println("-------------------------");
		InternationalStudent internationalStudent = new InternationalStudent();
		
		System.out.println("\nProvem TEACHER (HashSet)");
		System.out.println("-------------------------");
		if (teacher.addSubject("M01")) System.out.println("M01 added");
		if (teacher.addSubject("M02")) System.out.println("M02 added");
		if (teacher.addSubject("M03")) System.out.println("M03 added");
		if (teacher.addSubject("M04")) System.out.println("M04 added");
		if (teacher.addSubject("M05")) System.out.println("M05 added");
		if (teacher.addSubject("M06")) System.out.println("M06 added");
		// No repetits
		if (!teacher.addSubject("M01")) System.out.println("M01 ja esta al set!");
		// Eliminem
		if (teacher.removeSubject("M01")) System.out.println("M01 deleted");
		// Comprovem presència

		if (teacher.hasSubject("M03")) System.out.println("M03 is present");
		// Recorre subjects
		teacher.recorreSubjects();
	}
}
