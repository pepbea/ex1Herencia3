package factura;

public class Familia1 extends Factura{
	
	public Familia1(double consumo, double saneamiento, double residuos){
		super(consumo, saneamiento, residuos);
		desSaneamiento = 25.0;
		desResiduos = 25.0;
	}
	
	@Override
	protected double cantidadSaneamiento(){
		return saneamiento-(saneamiento*desSaneamiento/100);
	}
	
	@Override
	protected double cantidadResiduos(){
		return residuos-(residuos*desResiduos/100);
	}	
}