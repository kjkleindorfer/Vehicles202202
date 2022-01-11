import model.Car;
import model.Vehicle;

public class VehicleNoises {
	
	// add your vehicle class to the model package
	// only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
		
		Vehicle Toyota = new Vehicle();
		System.out.println(Toyota.makeNoise());
	}

}
