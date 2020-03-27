package exercicis.herencia.empleats;


public  class Comercial extends Empleat{
	
	private double comissio;
	
	
	public Comercial() {
		super();
	}
	
	public Comercial(String nom, String cognom, int edat, int salari,double comissio) {
		super(nom,cognom,edat,salari);
		this.comissio = comissio;
	}

	/*GETTERS & SETTERS*/
	public double getComissio() {
		return comissio;
	}

	public void setComissio(double comissio) {
		this.comissio = comissio;
	}

}
