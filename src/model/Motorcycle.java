package model;

public class Motorcycle {
	private String model;
	private String color;
	private int year;
	
	
	public Motorcycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Motorcycle(String model, String color, int year) {
		super();
		this.model = model;
		this.color = color;
		this.year = year;
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

	public String makeNoise() {
		return "Brun Brun!";
	}
	
}
