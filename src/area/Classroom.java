package area;

public class Classroom extends Area{
	
	private int capacity;
	private boolean chairTable;
	private int nComputers;
	private boolean networkConn;

	public Classroom(String code, double surfaceArea, boolean naturalLight,
			double consuption, int capacity) {
		super(code, surfaceArea, naturalLight, consuption);
		this.capacity=capacity;
	}
	
	public double surfaceAreaStudent(){
		return super.getSurfaceArea()-this.nComputers;
	}

	public boolean isChairTable() {
		return chairTable;
	}
	
	public void setChairTable(boolean chairTable) {
		this.chairTable = chairTable;
	}
	
	public boolean isNetworkConn() {
		return networkConn;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getnComputers() {
		return nComputers;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void setnComputers(int nComputers) {
		this.nComputers = nComputers;
	}

	public void setNetworkConn(boolean networkConn) {
		this.networkConn = networkConn;
	}
	
	
	

}
