package package10;

public class Furgoneta extends Vehicle
{
	private int pma;
	private static final int EXTRA=20;
	public Furgoneta()
	{
		super();
		this.pma=10;
	}
	public Furgoneta(String matricula, int diesLloguer, int pma)
	{
		super(matricula, diesLloguer);
		this.pma=pma;
	}
	public double getPreuLloguer()
	{

		return super.getPreuLloguer()+(EXTRA*pma);
	}
	public String toString()
	{
		return super.toString()+"\nPMA: "+pma+"\nExtra �"+EXTRA;
	}
}
