package ex3;

import java.util.*;

public class Teacher extends Person
{
	private HashSet<String> hst = new HashSet <String>();

	//CONSTRUCTORA
	public Teacher()
	{
		super();
		System.out.println("Soc el constructor de la classe Teacher");
	}


	public Teacher(String name, String address, HashSet<String> hst) {
		super(name, address);
		System.out.println("Soc el constructor de la classe Teacher");
		this.hst = hst;
	}

	//METODES DE CLASSE
	public boolean addSubject(String subject) {
		return hst.add(subject);
	}

	public boolean removeSubject(String subject) {
		return hst.remove(subject);
	}
	
	public boolean hasSubject(String subject) {
		return hst.contains(subject);
	}

	public void recorreSubjects(){
		System.out.println("Mostrem els cursos:");
		Iterator<String> it = hst.iterator();
		while (it.hasNext())
			System.out.println((String)it.next());
	}
}
