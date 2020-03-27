package factura;

public abstract class Factura{
	
	private double consumo;
	protected double saneamiento;
	protected double residuos;
	protected double desSaneamiento;
	protected double desResiduos;
	
	public Factura(double consumo, double saneamiento, double residuos){
		 this.consumo=consumo;
		 this.saneamiento=saneamiento;
		 this.residuos=residuos;
	}
	
	private double cantidadConsumida(){
		return consumo;
	}
	
	protected abstract double cantidadSaneamiento();
	
	protected abstract double cantidadResiduos();
	
	public double totalConsumido(){
		return cantidadConsumida()+cantidadSaneamiento()+cantidadResiduos();
	}
	
	public void detalles(){
		System.out.println("  DETALLES FACTURA\n====================");
		System.out.println(" Consumo: "+cantidadConsumida());
		System.out.println(" Saneamiento: "+cantidadSaneamiento());
		System.out.println(" Residuos: "+cantidadResiduos());
		System.out.println(" Descuento aplicado a Saneamiento: "+desSaneamiento);
		System.out.println(" Descuento aplicado a Residuos: "+desResiduos);
		System.out.println(" TOTAL: "+totalConsumido());
	}
}


