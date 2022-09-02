/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Aug 31, 2022
 */
package model;


public class Volkswagen {
	String model;
	int year;
	boolean stillInProduction;
	
	//Getters and Setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isStillInProduction() {
		return stillInProduction;
	}

	public void setStillInProduction(boolean stillInProduction) {
		this.stillInProduction = stillInProduction;
	}

	//Default no-arg constructor
	public Volkswagen() {
		super();
	}

	//Non-default constructor using parameters	
	public Volkswagen(String model, int year, boolean stillInProduction) {
		super();
		this.model = model;
		this.year = year;
		this.stillInProduction = stillInProduction;
	}

	//ToString method
	@Override
	public String toString() {
		return "Volkswagen [model=" + model + ", year=" + year + ", stillInProduction=" + stillInProduction + "]";
	}
	
	public String makeNoise() {
		return "Das Auto";
	}
	
	
	
	
	

}
