package biblioteca;


public class Fitxa
{
	protected String referencia;
	protected String titol;


	public Fitxa(){

	}

	public Fitxa(String ref, String tit) {
		referencia = ref;
		titol = tit;
	}

	public void setReferencia(String novaRef)
	{
		referencia = novaRef;
	}

	public void setTitol(String nouTit)
	{
		titol = nouTit;
	}

	public String getReferencia()
	{
		return referencia;
	}

	public String getTitol()
	{
		return titol;
	}



	@Override
	public boolean equals(Object obj)
	{
		if (obj == null) return false;
		if (!(obj instanceof Fitxa)) return false;

		Fitxa fitxa = (Fitxa)obj;
		if (this.referencia.compareTo(fitxa.referencia) == 0 )
			return true;

		return false;
	}


	/**
     * Sobreescribim el mètode hashCode per a mantenir la coherència amb equals(): dos objectes
     * iguals (és a dir que equals() retorni true) han de generar el mateix hashCode.
     * @return Hash code del string referencia (crieteri d'igualtat entre fitxes)
     */
	@Override
    public int hashCode()
    {
	    return this.referencia.hashCode();
    }

	@Override
	public String toString()
	{
		System.out.println("Referència:" + referencia);
		System.out.println("Títol:" + titol);
		return referencia + " " + titol;
	}
}