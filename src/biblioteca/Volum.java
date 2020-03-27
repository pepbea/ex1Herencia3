package biblioteca;

public class Volum extends Obra
{
   private int nro;
   
   public Volum (String ref, String tit, String aut, int nrePags, int nro)
   {
      super(ref, tit, aut, nrePags);
      this.nro = nro;
   }

   public void setNro (int nouNro)
   {
      nro = nouNro;
   }

   public int getNro ()
   {
      return nro;
   }  
   
	@Override
	public String toString()
	{
		String res = super.toString();
		System.out.println("Num volum:" + nro);
		return res + " " + nro;
	}

}