package exercicis.herencia.empleats;


public  class Repartidor extends Empleat{
	
	private String zona;
	
	
	public Repartidor() {
		super();
		zona = "Defecte";
	}
	
	public Repartidor(String nom, String cognom, int edat, int salari, String zona) {
		super(nom,cognom,edat,salari);
		this.zona = zona;
	}

	/*GETTERS & SETTERS*/
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

}
