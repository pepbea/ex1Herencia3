package organismes;

public class Plant extends Organism{
	
	private char type;    //"S" Tija, "B" Bulb, "R" Arrels


	public Plant(String name, String family, char light, double maxTemp,
			double minTemp, double maxPH, double minPH, char type) {
		super(name, family, light, maxTemp, minTemp, maxPH, minPH);
		this.type = type;
	}
	
	public String plantType(){
		String tipo= ""; 
		if(this.type == 's') tipo="Es un tallo";
		else if(this.type == 'b')  tipo=" Es un bulbo";
		else if(this.type == 'r')  tipo="Es una raiz";
		return tipo;

	}
	
	public void setType(char type){
		this.type=type;
	}

}
