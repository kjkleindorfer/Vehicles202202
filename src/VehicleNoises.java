import model.Car;
import model.Truck;

public class VehicleNoises {
	
	// add your vehicle class to the model package
	// only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
		Truck toyota = new Truck("Toyota", "Tundra", "Blue", 2003, 217289.7);
		System.out.println(toyota.makeNoise()); //William Thomas 01/11/2022
	}

}
