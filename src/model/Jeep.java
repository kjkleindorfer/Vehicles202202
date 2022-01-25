package model;

/**
 * @author Ryan Woods woods - rdwoods2
 * CIS175 - Fall 2021
 * Jan 21, 2022
 */
public class Jeep {
    private String name; 			//compass
    private String jeepPackage; 	//Latitude
    private int capacity;			//5
    
    public Jeep() {
            super();
    }
    
    public Jeep(String name, String jeepPackage, int capacity) { 
    	super();
    	this.name = name;
    	this.jeepPackage = jeepPackage;
    	this.capacity = capacity;
    }

    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getjeepPackage() {
    	return jeepPackage;
    }
    
    public void setjeepPackage(String jeepPackage) {
    	this.jeepPackage = jeepPackage;
    }
    
    public int getCapacity() {
    	return capacity;
    }
    
    public void setCapacity(int capacity) {
    	this.capacity = capacity;
    }
    
    public String makeNoise() {
    	return "meep meep i'm in my jeep";
    }
    
}