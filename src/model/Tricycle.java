package model;

/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Sep 1, 2022
 */
public class Tricycle {
	
	//instance variables
	private String color;
	private String ownerName;
	private boolean hasBell;
	
	//constructors
	public Tricycle() {
		super();
		color = "red";
		ownerName = "Some Kid";
		hasBell = false;
	}
	
	public Tricycle(String trikeColor, String owner, Boolean bellPresent) {
		color = trikeColor;
		ownerName = owner;
		hasBell = bellPresent;
	}

	//getters
	public String getColor() {
		return color;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public boolean isHasBell() {
		return hasBell;
	}
	
	//setters
	public void setColor(String color) {
		this.color = color;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setHasBell(boolean hasBell) {
		this.hasBell = hasBell;
	}
	
	//methods
	public String makeNoise() {
		String output = "";
		if(hasBell == true) {
			output = "Ding! Ding! Ding! " + ownerName + ": Hee Hoo bell.";
		}else {
			output = ownerName + ": WEEEEEEEEEEeeeee!";
		}
		return output;
	}
	
}
