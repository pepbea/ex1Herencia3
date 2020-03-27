package package10;
public  class Cotxe extends Vehicle
{
	private double EXTRA=1.5;
	private int places;
	public Cotxe()
	{
		super();
		this.places=4;
	}
	public Cotxe(String matricula, int diesLloguer, int places)
	{
		super(matricula, diesLloguer);
		this.places=places;
	}

	public double getPreuLloguer() {

		return super.getPreuLloguer() + (EXTRA * places * getDiesLloguer());
	}


	public double retornaPreu(){
		return getPreuLloguer() + (EXTRA * places * getDiesLloguer());
	}

	public String toString() {
		return super.toString() + "\nPlaces: " + places + "\nExtra €: " + EXTRA;
	}
}
