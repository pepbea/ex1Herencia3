package package10;

public class Camio extends Furgoneta
{
	private static final int EXTRA=40;
	public Camio() {
		super();
	}

	public Camio(String matricula, int diesLloguer, int pma) {
		super(matricula, diesLloguer, pma);
	}

	public double getPreuLloguer() {

		return super.getPreuLloguer() + EXTRA;
	}

	public String toString()
	{
		return super.toString()+"\nExtra :"+EXTRA;
	}
}
