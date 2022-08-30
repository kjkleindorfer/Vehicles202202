package model;

/**
 * @author alexh - aheinrichs
 * CIS175 - Fall 2022
 * Aug 30, 2022
 */
public class Boat {
	String model;
	int yearMade;
	String color;
	
	//Default constructor
	public Boat() {
		super();
	}
	
	//Constructor with parameters
	public Boat(String model, int yearMade, String color) {
		super();
		this.model = model;
		this.yearMade = yearMade;
		this.color = color;
	}
	
	//Getters and Setters
	String getModel() {return model;}
	void setModel(String model) {this.model = model;}
	
	int getYearMade() {return yearMade;}
	void setYearMade(int yearMade) {this.yearMade = yearMade;}
	
	String getColor() {return color;}
	void setColor(String color) {this.color = color;}
	
	//Honk the horn!
	String makeNoise() {
		return "WOOOOOOOOOOOOOOMP";
	}
}
