package exercicis.herencia.empleats;

public class Empleat {
	
	protected String nom;
	protected String cognom;
	protected int edat;
	protected int salari;
	
	
	/*CONSTRUCTORS*/
	public Empleat() {
		nom = "";
		cognom="";
	}
	
	public Empleat(String nom, String cognom, int edat, int salari) {
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
		this.salari = salari;
	}

	public boolean plus (int quantitat){
		if(edat>40){
			salari = salari + quantitat;
			return true;
		}else{
			return false;
		}
	}

	public boolean comprovaNom (){
		return this.nom.equals("");
	}
	
	/*GETTERS & SETTERS*/
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if (nom != null)
			this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		if (cognom != null)
	        this.cognom = cognom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public int getSalari() {
		return salari;
	}

	public void setSalari(int salari) {
		this.salari = salari;
	}
	
	
	
}
