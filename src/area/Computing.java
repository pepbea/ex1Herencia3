package area;

public class Computing extends Classroom{
	
	private int nPrinters;

	public Computing(String code, double surfaceArea, boolean naturalLight,
			double consuption, int capacity) {
		super(code, surfaceArea, naturalLight, consuption, capacity);
	}

	public int getnPrinters() {
		return nPrinters;
	}

	public void setnPrinters(int nPrinters) {
		this.nPrinters = nPrinters;
	}
	
	
	
	

}
