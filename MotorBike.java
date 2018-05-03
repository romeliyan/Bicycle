public class MotorBike extends Bicycle {
	
	private double engineCapacity;
	
	public MotorBike(String brand, double regularPrice, String color, double engineCapacity){
		super(brand, regularPrice, color);
		this.engineCapacity = engineCapacity;
	}
	
	
	public double getSalePrice() {
		
		if(engineCapacity > 1500) {
			return regularPrice - (regularPrice * 15.0/100.0);
			
		}
		else {
			return regularPrice - (regularPrice * 10.0/100.0);
		}
		
	}
	
}
