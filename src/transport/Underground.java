package transport;

public class Underground extends Transport{

	private double ticketPrice;
	
	public Underground(String id, double speed, double ticketPrice) {
		super(id, speed);
		this.ticketPrice = ticketPrice;
	}
	
	@Override
	public double cost(double distance){
		double eurosAugment = distance / 5;
		return ticketPrice + eurosAugment;
	}

	/*GETTERS & SETTERS*/
	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice=ticketPrice;
	}
}
