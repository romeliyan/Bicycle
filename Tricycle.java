
public class Tricycle extends Bicycle {
	
	private int year;
	private double taxDiscount;
	
	public Tricycle(String brand, double regularPrice, String color, int year, double taxDiscount) {
		super(brand, regularPrice, color);
		this.year = year;
		this.taxDiscount = taxDiscount;
	}
	
	public double getSalePrice() {
		return regularPrice - taxDiscount;
	}

}
