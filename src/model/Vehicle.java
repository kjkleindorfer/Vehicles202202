package model;

/**
 * @author roman -rggeleta@dmacc.edu
 * CIS175 - Spring 2022
 * Jan 11, 2022
 */
public class Vehicle {
	
	//Create 3 instance variables
	private String name;
	private String model;
	private int age;
	
	//Contractor
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
// non default contractor
	
	public Vehicle(String name, String model, int age) {
		super();
		this.name = name;
		this.model = model;
		this.age = age;
	}



	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Create a method called makeNoise( )
	
	public String makeNoise() {
		return "Beeeep!";
	}
//toString method
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", model=" + model + ", age=" + age + "]";
	}

}
