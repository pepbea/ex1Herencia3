package biblioteca;

public class Obra extends Fitxa
{
   protected String autor;
   protected int nrePags;

   public Obra (String ref, String tit, String aut, int nrePags)
   {
      super(ref,tit);
      autor = aut;
      this.nrePags = nrePags;
   }

   public void setAutor (String nouAutor)
   {
      autor = nouAutor;
   }
   
   public void setNumPags (int nouNrePags)
   {
	   nrePags = nouNrePags;
   }

   public String getAutor ()
   {
      return autor;
   }

   public int getNrePags ()
   {
      return nrePags;
   }
   
	@Override
	public String toString()
	{
		String res = super.toString();
		System.out.println("Autor:" + autor);
		System.out.println("Num pàgines:" + nrePags);
		return res + " " + autor + " " + nrePags;
	}

}