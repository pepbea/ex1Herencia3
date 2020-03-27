package package10;
public class Microbus extends Vehicle
{
	private int EXTRA=2;
	private int places;
	public Microbus()
	{
		super();
		this.places=4;
	}

	public Microbus(String matricula, int diesLloguer, int places)
	{
		super(matricula, diesLloguer);
		this.places=places;
	}

	public double getPreuLloguer()
	{
		return super.getPreuLloguer()+(EXTRA*places);
	}
	public String toString()
	{
		return super.toString()+"\nPlaces: "+places+"\nExtra: �"+EXTRA;
	}
}
