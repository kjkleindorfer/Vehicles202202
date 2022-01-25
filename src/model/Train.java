package model;
/**
 * @author Cyrus Jacob Brucker
 *CIS175 - Fall 2021
 * Jan 20, 2022
 */
public class Train {

	//Three variables 
	private String model; 
	private String typeOfTrain;
	private int numOfCarts;
	
	//constructors
	public Train() {
		super();
	}
	public Train(String model, String typeOfTrain, int numOfCarts) {
		super();
		this.model = model;
		this.typeOfTrain = typeOfTrain;
		this.numOfCarts = numOfCarts;
	}
	//getters and setters for variables 
	public String getModel() {
		return model; 
	}
	public void setModel(String model) {
		this.model = model; 
	}
	public String getTypeOfTrain() {
		return typeOfTrain; 
	}
	public void setTypeOfTrain(String typeOfTrain) {
		this.typeOfTrain = typeOfTrain; 
	}
	public int getNumOfCarts() {
		return numOfCarts;
	}
	public void setNumOfCarts(int numOfCarts) {
		this.numOfCarts = numOfCarts; 
	}
	//makeNoise method to return the noise of the vehicle. 
	public String makeNoise() {
		String trainNoise = "choo choo"; 
		return trainNoise; 
	}
}
