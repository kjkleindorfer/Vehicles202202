import model.Car;
import model.Plane;
import model.SemiTruck;
import model.Spaceship;
import model.Vehicle;
import model.Truck;
import model.Bicycle;
import model.*;

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
		
		Spaceship atlantis = new Spaceship("Space Shuttle Atlantis", "United States", 5);
		System.out.println(atlantis.makeNoise());

		Bicycle oldBike = new Bicycle("Red", false, 3);
		System.out.println(oldBike.makeNoise());
		
		SemiTruck semi = new SemiTruck("Mack Trucks", "Granite", true);
		System.out.println(semi.makeNoise());
		
		Motorcycle myBike = new Motorcycle("Honda", "CBR600rr", "2003");
		System.out.println(myBike.makeNoise());
		
		Van myVan = new Van(4, true, "carpet");
		System.out.println(myVan.makeNoise());
		
		Jeep blueJeep = new Jeep ("Jeep Compass", "Latitude", 5);
		System.out.println(blueJeep.makeNoise());
	}

}