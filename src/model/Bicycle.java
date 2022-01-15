/**
 * @author Bobby - rfparsons
 * CIS175 - Spring 2022
 * Jan 14, 2022
 */
package model;

/**
 * @author Bobby
 *
 */
public class Bicycle {
	String color;
	boolean trainingWheels;
	int speeds;
	
	public Bicycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bicycle(String color, boolean trainingWheels, int speeds) {
		super();
		this.color = color;
		this.trainingWheels = trainingWheels;
		this.speeds = speeds;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the trainingWheels
	 */
	public boolean isTrainingWheels() {
		return trainingWheels;
	}

	/**
	 * @param trainingWheels the trainingWheels to set
	 */
	public void setTrainingWheels(boolean trainingWheels) {
		this.trainingWheels = trainingWheels;
	}

	/**
	 * @return the speeds
	 */
	public int getSpeeds() {
		return speeds;
	}

	/**
	 * @param speeds the speeds to set
	 */
	public void setSpeeds(int speeds) {
		this.speeds = speeds;
	}
	
	public String makeNoise() {
		return "Ding ding ding!";
	}
}
