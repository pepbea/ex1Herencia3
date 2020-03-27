package exercicis.herencia.empleats;

import java.util.*;

public class GestioEmpleats {

	public static void main(String[] args) {
		
		//Transport t = new Transport("cotxeId", 1.0);
		Empleat e1 = new Empleat();
		Empleat e2 = new Empleat("Joan","Perez", 40, 25000);
		Comercial c1 = new Comercial();
		Comercial c2 = new Comercial("Maria","Rodriguez", 25, 35000, 5.5);
		Repartidor b1 = new Repartidor();
		Repartidor b2 = new Repartidor("Manel","Garcia", 35, 30000, "Poblenou");
		
	
		HashSet<Empleat> hst = new HashSet<Empleat>();
		hst.add(e1);
		hst.add(e2);
		hst.add(c1);
		hst.add(c2);
		hst.add(b1);
		hst.add(b2);
		
		for(Empleat t : hst) {
			System.out.println("Classe: "+ t.getClass().getName());
			System.out.println("Nom i Cognom: "+ t.getNom()+" "+t.getCognom());
			System.out.println("Edat: "+ t.getEdat());
			System.out.println("Salari: "+ t.getSalari());
			
			if (t instanceof Comercial){
				Comercial c = (Comercial)t;
				System.out.println("Comissió: "+ c.getComissio());
			}
			else if (t instanceof Repartidor){
				Repartidor b = (Repartidor)t;
				System.out.println("Zona: "+ b.getZona());
			}
			
			System.out.println("");
		}
	}

}
