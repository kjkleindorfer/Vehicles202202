package model;

/**
 * @author Phuoc Tran - ptran9@dmacc.edu
 * CIS175 - Spring 2024
 * Jan 12, 2024
 */
public class MotorScooter {
	private String brand;
    private String color; 
    private int maxSpeed;
	
	public MotorScooter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MotorScooter(String brand, String color, int maxSpeed) {
		super();
		this.brand = brand;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	//Getter and setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "MotorScooter [brand=" + brand + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}   
	
	//Make noise method
	public String makeNoise() {
        return "Broon Broon!";
    }
}
