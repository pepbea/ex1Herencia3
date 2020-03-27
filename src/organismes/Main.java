package organismes;

public class Main {

	public static void main(String[] args) {
		
		Fish pescao1= new Fish("Pescao1"," de los pescaos de toda la vida",'m',35.0,10.0,4.0,2.0);
		System.out.println(pescao1.acidity());
		System.out.println(pescao1.temperature());
		pescao1.setDiet('w');
		pescao1.setLength(25.5);
		pescao1.setOrigin("Barcelona");
		System.out.println(pescao1.lighType());
		System.out.println("Dieta: " + pescao1.dietType());
		System.out.println("Tama�o: " + pescao1.getLength());
		System.out.println("Pescao1. De la familia: " + pescao1.getFamily());
		
		Plant planta1= new Plant("Cactus","de los cactus",'h',50.0,-10.0,9.0,5.0,'c');
		planta1.setType('s');
		System.out.println(planta1.plantType());

	}

}
