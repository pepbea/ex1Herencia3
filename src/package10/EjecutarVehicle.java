package package10;
public class EjecutarVehicle 
{
	public static void main(String[] args) 
	{
		System.out.println("\n------------ CONSTRUCTORS PER DEFECTE ------------ ");
		Vehicle a = new Vehicle();
		System.out.println("\n------- VEHICLE ------- "+a);
		System.out.println("Preu: "+a.getPreuLloguer());
		Cotxe b = new Cotxe();
		System.out.println("\n------- COTXE ------- "+b);
		System.out.println("Preu: "+b.getPreuLloguer());
		Microbus c = new Microbus();
		System.out.println("\n------- MICROBUS ------- "+c);
		System.out.println("Preu: "+c.getPreuLloguer());
		Furgoneta d = new Furgoneta();
		System.out.println("\n------- FURGONETA ------- "+d);
		System.out.println("Preu: "+d.getPreuLloguer());
		Camio e = new Camio();
		System.out.println("\n------- CAMIO ------- "+e);
		System.out.println("Preu: "+e.getPreuLloguer());
		System.out.println("\n------------ CONSTRUCTORS PERSONALS ------------ ");
		Vehicle f = new Vehicle("5555ZZZ", 5);
		System.out.println("\n------- VEHICLE ------- "+f);
		System.out.println("Preu: "+f.getPreuLloguer());
		Cotxe g = new Cotxe("5555ZZZ", 5, 6);
		System.out.println("\n------- COTXE ------- "+g);
		System.out.println("Preu: "+g.getPreuLloguer());
		Microbus h = new Microbus("5555ZZZ", 5, 6);
		System.out.println("\n------- MICROBUS ------- "+h);
		System.out.println("Preu: "+h.getPreuLloguer());
		Furgoneta i = new Furgoneta("5555ZZZ", 5, 1000);
		System.out.println("\n------- FURGONETA ------- "+i);
		System.out.println("Preu: "+i.getPreuLloguer());
		Camio j = new Camio("5555ZZZ", 5, 3);
		System.out.println("\n------- CAMIO ------- "+j);
		System.out.println("Preu: "+j.getPreuLloguer());
	}
}
