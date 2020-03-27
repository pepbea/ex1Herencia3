package package10;

public class Vehicle2 
{
	protected static int comptaVehicles = 0;
	private String matricula;
	private double preuLloguer=10;
	private int diesLloguer;

	public Vehicle2()
	{
		comptaVehicles++;
		this.matricula="4444FFF";
		this.diesLloguer=1;
	}
	public Vehicle2(String matricula, int diesLloguer)
	{
		comptaVehicles++;
		this.matricula=matricula;
		this.diesLloguer=diesLloguer;
	}
	
	protected void finalize()throws Throwable{
		comptaVehicles--;
		super.finalize();
	}
		
	public void setPreuLloguer(double preuLloguer)
	{
		this.preuLloguer=preuLloguer;
	}
	public double getPreuLloguer()
	{
		return preuLloguer;
	}
	public void setDiesLloguer(int diesLloguer)
	{
		this.diesLloguer=diesLloguer;
	}
	public int getDiesLloguer()
	{
		return diesLloguer;
	}
	public String toString()
	{
		return "\nMatricula: "+matricula+"\nDies Lloguer: "+diesLloguer;
	}
}
