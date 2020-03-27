package transport;

import java.util.*;

public class GestioTransports {

	public static void main(String[] args) {
		
		Car c1 = new Car("C1", 80, "Gasolina", 1.65,9.0);
		Car c2 = new Car("C2", 100,"Gasoil", 1.5, 8.5);
		Bicycle b1 = new Bicycle("B3", 40, 6);
		Bicycle b2 = new Bicycle("B4", 30, 3);
		Underground u1 = new Underground("U5", 50, 2);
		Underground u2 = new Underground("U6", 60, 5);

		ArrayList<Transport> transports = new ArrayList<Transport>();
		transports.add(c1);
		transports.add(c2);
		transports.add(b1);
		transports.add(b2);
		transports.add(u1);
		transports.add(u2);

		Scanner inpunt = new Scanner(System.in);
		System.out.print("Distància a recórrer: ");
		double dist = inpunt.nextDouble();
        System.out.println();

		for(Transport t : transports){
			System.out.println("Classe: "+ t.getClass().getName());
			System.out.println("ID: "+ t.getId());
			System.out.println("Speed: "+ t.getSpeed());
			System.out.println("El temps es: "+ t.time(dist));
			System.out.println("El cost es: "+ t.cost(dist));
			if(t instanceof Car){
				Car c = (Car)t;
				System.out.println("getLiterPrice: "+ c.getLiterPrice());
				System.out.println("getLitersKm: "+ c.getLitersKm());
				System.out.println("");
			}else if(t instanceof Bicycle){
				Bicycle b = (Bicycle)t;
				System.out.println("getNgears: "+ b.getNGears());
				System.out.println("");
			}else if(t instanceof Underground){
				Underground u = (Underground)t;
				System.out.println("getTicketPrice: "+ u.getTicketPrice());
				System.out.println("");
			}
			
		}
	}

}
