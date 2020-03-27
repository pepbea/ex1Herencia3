package area;

public class Gym extends Classroom{
	
	private boolean showers;
	private int nStands;

	public Gym(String code, double surfaceArea, boolean naturalLight,
			double consuption, int capacity) {
		super(code, surfaceArea, naturalLight, consuption, capacity);
	}
	
	@Override
	public double surfaceAreaStudent(){
		return super.getSurfaceArea()- this.nStands;
	}

	public boolean isShowers() {
		return showers;
	}

	public void setShowers(boolean showers) {
		this.showers = showers;
	}

	public int getnStands() {
		return nStands;
	}

	public void setnStands(int nStands) {
		this.nStands = nStands;
	}
	
	
	
	

}
