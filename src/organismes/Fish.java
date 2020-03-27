package organismes;

public class Fish extends Organism{
	
	private String origin;
	private char diet; // ("W" Algues, "O" Omn�vor, "L" Fulles)
	private double length;
	
	
	public Fish(String name, String family, char light, double maxTemp,
	    double minTemp, double maxPH, double minPH) {
		super(name, family, light, maxTemp, minTemp, maxPH, minPH);
	}
	
	public String dietType(){
		String dieta= ""; 
		if(this.diet == 'w') dieta="Se alimenta de algas";
		else if(this.diet == 'm')  dieta=" Es omn�voro";
		else if(this.diet == 'l')  dieta="Se alimenta de hojas";
		return dieta;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setDiet(char diet) {
		this.diet = diet;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	

}
