public class XYZCycles {

	
	public static void main(String args[]) {
	
		
		Bicycle bicycle_1 = new Bicycle("BMX", 40000, "Green");
		Tricycle tricycle_1 = new Tricycle("Yamaha", 35000, "Pink", 2018 , 5000);
		
		MotorBike motorbike_1 = new MotorBike("Honda", 75000, "Red",1000 );
		
		System.out.println("Bicycle Sale Price is : " + bicycle_1.getSalePrice());
		System.out.println("Tricycle Sale Price is : " + tricycle_1.getSalePrice());
		System.out.println("MotorBike Sale Price is : " + motorbike_1.getSalePrice());
		
	}
	
	
	
	
}
