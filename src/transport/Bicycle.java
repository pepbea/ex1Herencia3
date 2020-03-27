package transport;

public class Bicycle extends Transport{
	
	private int nGears;    //"S" Tija, "B" Bulb, "R" Arrels
	
	public Bicycle(String id, double speed, int nGears) {
		super(id,speed);
		this.nGears = nGears;
	}
	
	@Override
	public double cost (double distance){
		return 0;
	}
	
	/*GETTERS & SETTERS*/
	public int getNGears() {
		return nGears;
	}
	
}
