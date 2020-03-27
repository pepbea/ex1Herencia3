package factura;

public class Familia2 extends Factura{
	
	public Familia2(double consumo, double saneamiento, double residuos){
		super(consumo, saneamiento, residuos);
		desSaneamiento = 75.0;
		desResiduos = 50.0;
	}

	@Override
	protected double cantidadSaneamiento(){
		double res = saneamiento-(saneamiento*desSaneamiento/100);
		if (res >= 16)
			return 16;
		else
			return res;
	}
	
	@Override
	protected double cantidadResiduos(){
		double res = residuos-(residuos*desResiduos/100); 
		if (res >= 16)
			return 16;
		else
			return res;
	}
	
	public void detalles(){
		super.detalles();
		System.out.println(" NOTA: si el importe maximo de saneamiento y residuos es superior a 16, se cuenta 16.");
	}
}
