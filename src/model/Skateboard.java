package model;

/**
 * @author dwood - ddwood2
 * CIS175 - Fall 2022
 * Aug 28, 2022
 */
public class Skateboard {
	// 3 instance variables
	private String shape;
	private String brand;
	private double width;
	
	public Skateboard() {
		super();
	}
	
	public Skateboard(String shape, String brand, double width) {
		super();
		this.shape = shape;
		this.brand = brand;
		this.width = width;
	}
	
	/**
	 * @return the shape
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * @param shape the shape to set
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	// method makeNoise()
	public String makeNoise() {
		return "zzZzZZzzzSkrrk-pop";
	}
}
