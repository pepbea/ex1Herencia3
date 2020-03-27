package transport;

public abstract class Transport {
	
	private String id;
	private double speed;
	
	public Transport(String identificador, double speed) {
		this.id = identificador;
		this.speed = speed;
	}
	
	public double time(double distance){
		return speed/distance;
	}
	
	public abstract double cost (double distance);
	
	/*GETTERS & SETTERS*/
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String getId() {
		return id;
	}
}
