package area;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Area a = new Area();
		Classroom c1 = new Classroom("codi1", 50, true, 10, 30);
		Classroom c2 = new Classroom("codi2", 80, true, 10, 20);
		Office o1 = new Office();
		Office o2 = new Office("codi3", 80, false, 10);
		Computing comp1 = new Computing("codi4", 330, true, 230, 30);
		Gym gym1 = new Gym("codi5", 100, false, 500, 30);
		Laboratory lab1 = new Laboratory("codi6", 600, false, 200, 30);

		HashSet<Area> a = new HashSet<Area>();
		a.add(c1);
		a.add(c2);
		a.add(o1);
		a.add(o2);
		a.add(comp1);
		a.add(gym1);
		a.add(lab1);
		
		for(Area area : a){
			System.out.println("El codi de l'�rea �s: "+area.getCode());
			System.out.println("De tipus:"+area.getClass().getName());
			System.out.println("El consum �s:"+area.getConsuption());
			if(area instanceof Gym){
				Gym gym = (Gym)area;
				System.out.println("El total de metres h�bils:"+gym.surfaceAreaStudent());
			} else if(area instanceof Classroom){
				Classroom clas = (Classroom)area;
				System.out.println("El total de metres h�bils:"+clas.surfaceAreaStudent());
			} else{
				System.out.println("El total de metres h�bils:"+area.getSurfaceArea());
			}
			System.out.println("");
		}
	}

}
