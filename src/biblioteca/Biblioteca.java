package biblioteca;

public class Biblioteca {

	private Fitxa[] biblio;
	
	public Biblioteca(int dimensio) {

		biblio = new Fitxa[dimensio];
	}
	
	public int capacitat() {
		return biblio.length;
	}
	
	public int numFitxes() {
		int num = 0;
		for (Fitxa f: biblio) {
			if (f != null) num++;
		}
		return num;
	}
	
	public boolean afegirFitxa(Fitxa f) {
	    int pos = -1;

	    // Recorrem tot el vector
        // Si trobem una posició lliure la guardem (sempre insertarem a la última lliure)
        // Comprovem que la fitxa no estigui repetida a les posicions ocupades
		for (int i=0; i<biblio.length; i++) {
			if (biblio[i] == null) {
				pos = i;
			}
			else {
			    if (biblio[i].equals(f)) return false;
            }
		}

		// Si la fitxa no està repetida i el vector no està plè
		if (pos > -1) {
            biblio[pos] = f;
            return true;
        }

		return false;
	}
	
	public Fitxa extreure(String ref) {
	    Fitxa f;

        for (int i=0; i<biblio.length; i++)
        {
            if ((biblio[i] != null) && (biblio[i].getReferencia().equals(ref))) {
                f = biblio[i];
                biblio[i] = null;
                return f;
            }
        }
		return null;
	}

    public Fitxa obtenirFitxa(int pos) {
        if ((pos >= 0) && (pos < biblio.length)) {
            return biblio[pos];
        }
        return null;
    }

    public void visualitzar() {
        for (Fitxa f: biblio) {
            if (f != null)
                System.out.println(f + "\n");
        }
    }
}
