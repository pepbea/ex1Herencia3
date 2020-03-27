package biblioteca;


public class Revista extends Fitxa
{
   private int any;
   private int nro;

   public Revista(String ref, String tit, int any, int nro)
   {
      super(ref, tit);
      this.any = any;
      this.nro = nro;
   }

   public void setAny (int nouAny)
   {
	   any = nouAny;
   }

   public void setNro (int nouNro)
   {
      nro = nouNro;
   }

   public int getAny ()
   {
      return any;
   }

   public int getNro ()
   {
      return nro;
   }
 
	@Override
	public String toString()
	{
		String res = super.toString();
		System.out.println("Any:" + any);
		System.out.println("Num:" + nro);
		return res + " " + any + " " + nro;
	}

}