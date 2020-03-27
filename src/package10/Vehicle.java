package package10;

public class Vehicle
{
	private String matricula;
	private double preuLloguer=10;
	private int diesLloguer;
	public Vehicle()
	{
		this.matricula="4444FFF";
		this.diesLloguer=1;
	}
	public Vehicle(String matricula, int diesLloguer)
	{
		this.matricula=matricula;
		this.diesLloguer=diesLloguer;
	}

	//public abstract double retornaPreu();


	public void setPreuLloguer(double preuLloguer) {
		this.preuLloguer = preuLloguer;
	}

	public double getPreuLloguer() {
		return preuLloguer;
	}

	public void setDiesLloguer(int diesLloguer) {
		this.diesLloguer = diesLloguer;
	}

	public int getDiesLloguer() {
		return diesLloguer;
	}

	public String toString() {
		return "\nMatricula: " + matricula + "\nDies Lloguer: " + diesLloguer;
	}
}
