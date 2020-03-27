package area;

public abstract class Area {
	private String code;
	private double surfaceArea;
	private boolean naturalLight;
	private double consuption;
	
	public Area(){
	}

	public Area(String code, double surfaceArea, boolean naturalLight, double consuption) {
		this.code = code;
		this.surfaceArea = surfaceArea;
		this.naturalLight = naturalLight;
		this.consuption = consuption;
	}
	
	public double consuptionM2 (){
		return this.consuption/this.surfaceArea;
		//return this.consuption;
	}
	
	public String getCode(){
		return this.code;
	}
	
	public double getSurfaceArea(){
		return this.surfaceArea;
	}
	
	public boolean isNaturalLight(){
		return this.naturalLight;
	}
	
	public double getConsuption(){
		return this.consuption;
	}

	
}
