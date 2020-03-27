package factura;

public class Normal extends Factura{
	
	public Normal(double consumo, double saneamiento, double residuos){
		super(consumo, saneamiento, residuos);
		desSaneamiento = 0.0;
		desResiduos = 0.0;

	}
	
	protected double cantidadSaneamiento(){
		return saneamiento;
	}
	
	protected double cantidadResiduos(){
		return residuos;
	}

}
