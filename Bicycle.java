public class Bicycle {

	private String brand;
	protected double regularPrice;
	private String color;

	public Bicycle(String brand, double regularPrice, String color) {
		this.brand = brand;
		this.regularPrice = regularPrice;
		this.color = color;
		
	}
	
	
	public Bicycle(double regularPrice, String color) {
		this.regularPrice = regularPrice;
		this.color = color;
	}
	
	
	public double getSalePrice() {
		return regularPrice;
	}

} 
