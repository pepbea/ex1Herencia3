package biblioteca;


public class ProvaBiblioteca
{

	public static void main(String args[])
	{
		Biblioteca b = new Biblioteca(50);

		Revista r = new Revista("MC001","Mundo Científico", 2005, 1);
		Obra o = new Obra("EQ001","El Quixot","Miguel de Cervantes",1000);
		Volum v1 = new Volum("EC001","Enciclopèdia Catalana","Varis",573,1);
		Volum v2 = new Volum("EC002","Enciclopèdia Catalana","Varis",602,2);
		
		System.out.println("La biblioteca té una capacitat per a " + b.capacitat() + " exemplars.\n");
		System.out.println("La biblioteca té " + b.numFitxes() + " exemplars.\n");

        b.afegirFitxa(r);
		b.afegirFitxa(o);
		b.afegirFitxa(v1);
		b.afegirFitxa(v2);

		System.out.println("\nAra la biblioteca té " + b.numFitxes() + " exemplars");
        b.visualitzar();

		System.out.println("\nAnem a extreure la fitxa de referència 'EQ001'");
		Fitxa f = b.extreure("EQ001");
		if (f==null) System.out.println("No s'ha trobat.");
		else {
			System.out.println("S'ha trobat:");
			f.toString();
		}

		System.out.println("\nAnem a mostrar la fitxa a la posició 2'");
		f = b.obtenirFitxa(2);
		if (f==null) System.out.println("No s'ha trobat.");
		else {
			System.out.println("S'ha trobat:");
			f.toString();
		}

        System.out.println("\nAra la biblioteca té " + b.numFitxes() + " exemplars");
		b.visualitzar();

		// Intentem afegir una referència repetida
        System.out.println("Abans: la biblioteca té " + b.numFitxes() + " exemplars.");
		f = new Fitxa("MC001", "Mundo Científico");
		System.out.println(b.afegirFitxa(f));
        System.out.println("Després: la biblioteca té " + b.numFitxes() + " exemplars.");
	}
}
