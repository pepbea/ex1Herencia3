package factura;

public class GestioFactures {
	public static void main(String[] args) {
		System.out.println("\n  *********************** NORMAL ***********************");
		Normal normal = new Normal(10, 20, 30);
		normal.detalles();
		
		System.out.println("\n  *********************** FAMILIA 1 ***********************");			
		Familia1 fam1 = new Familia1(10, 20, 30);
		fam1.detalles();
		
		System.out.println("\n  *********************** FAMILIA 2 ***********************");
		Familia2 fam2 = new Familia2(10, 20, 30);
		fam2.detalles();
		
		System.out.println("\n  *********************** FAMILIA 2 ***********************");
		fam2 = new Familia2(100, 200, 30);
		fam2.detalles();
	}
}