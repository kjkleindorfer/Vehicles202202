import model.Car;
import model.Plane;
import model.Vehicle;
import model.Truck;

public class VehicleNoises {
	
	// add your vehicle class to the model package
	// only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
		
		Vehicle Toyota = new Vehicle();
		System.out.println(Toyota.makeNoise());

		Truck toyota = new Truck("Toyota", "Tundra", "Blue", 2003, 217289.7);
		System.out.println(toyota.makeNoise()); //William Thomas 01/11/2022
		
		Plane Boeing = new Plane("Boeing 737", "White", 2015);
		System.out.println(Boeing.makeNoise()); 
	}

}
