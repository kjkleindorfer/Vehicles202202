//William Thomas, wdthomas2@dmacc.edu, 01/11/2022

package model;

public class Truck {
	private String make;
	private String model;
	private String color;
	private int year;
	private double miles;
	
	public Truck() {
		super();
	}
	
	public Truck(String make, String model, String color, int year, double miles) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.miles = miles;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(float miles) {
		this.miles = miles;
	}
	
	@Override
	public String toString() {
		return make + ", " + model + ".\nColor: " + color + ".\nYear: " +
				year + ". Miles: " + miles;
	}
	public String makeNoise() {
		return "Vroom! Vroom!";
	}
}
