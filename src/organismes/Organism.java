package organismes;

public abstract class Organism {
	
	private String name;
	private String family;
	private char light;
	private double maxTemp;
	private double minTemp;
	private double maxPH;
	private double minPH;
	
	
	public Organism(String name, String family, char light, double maxTemp,
			double minTemp, double maxPH, double minPH) {
		this.name = name;
		this.family = family;
		this.light = light;    // "H" alta, mitjana "M" i baixa "L"
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.maxPH = maxPH;
		this.minPH = minPH;
	}
	
	public String acidity(){
		return "Los margenes de PH estan entre "+this.minPH+" - "+this.maxPH;
	}
	
	public String temperature(){	
		return "Los margenes de temperatura estan entre "+this.minTemp+" - "+this.maxTemp;
	}
	
	public String lighType(){
		String luz= ""; 
		if(this.light == 'h') luz="Necesidad Alta de Luz";
		else if(this.light == 'm')  luz="Necesidad Media de Luz";
		else if(this.light == 'l')  luz="Necesidad Baja de Luz";
		return luz;
	}

	public String getName() {
		return name;
	}

	public String getFamily() {
		return family;
	}

	public char getLight() {
		return light;
	}

}
