package biblioteca;

import java.util.HashSet;
import java.util.Iterator;

public class ProvaFitxes {

    public static void main(String args[]) {
        Fitxa fitxa1 = new Fitxa("001", "La conjura de los necios");
        Fitxa fitxa2 = new Fitxa("002", "Sin notícias de Gurb");
        Fitxa fitxa3 = new Fitxa("002", "Duplicado");




        if (fitxa1.equals(fitxa2))
            System.out.println("fitxa1 == fitxa2");

        if (fitxa2.equals(fitxa3))
            System.out.println("fitxa2 == fitxa3");

        System.out.println();


        // Prova en un HashSet al sobreescriure equals() i hashCode()
        HashSet<Fitxa> hsFitxas = new HashSet<Fitxa>();
        System.out.println(hsFitxas.add(fitxa1));
        System.out.println(hsFitxas.add(fitxa2));
        System.out.println(hsFitxas.add(fitxa3));


        // Exemple de POLIMORFISME
        Obra obra = new Obra("004", "El jugador", "Fiodor Dostoyevsky", 123);
        Revista revista = new Revista("010", "Wire", 2017, 512);
        Volum volum = new Volum("005", "El tiempo perdido", "Marcel Proust", 500, 1);

        // Al HashSet de Fitxa podem afegir objectes de les subclasses
        hsFitxas.add(obra);
        hsFitxas.add(revista);
        hsFitxas.add(volum);

        // Recorregut del HashSet
        Iterator<Fitxa> it = hsFitxas.iterator();
        while (it.hasNext())
        {
            Fitxa fit = it.next();
            System.out.println();
            System.out.println(fit.getClass());
            System.out.println(fit.toString());


            if (fit instanceof Obra)
                System.out.println("getAutor(): " + ((Obra)fit).getAutor());
        }
    }
}
