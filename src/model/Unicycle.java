/**
 * @author theaw - manuelcorralledezma@dmacc.edu
 * CIS175 - Spring 2022
 * Jan 20, 2022
 */
package model;

/**
 * @author theaw
 *
 */
public class Unicycle {
	String color = "blue";
	boolean seat = true;
	int wheelSize =18;
	/**
	 * 
	 */
	public Unicycle() {
		super();
	}
	/**
	 * @param color
	 */
	public Unicycle(String color) {
		super();
		this.color = color;
	}
	/**
	 * @param color
	 * @param seat
	 */
	public Unicycle(String color, boolean seat) {
		super();
		this.color = color;
		this.seat = seat;
	}
	/**
	 * @param color
	 * @param seat
	 * @param wheelSize
	 */
	public Unicycle(String color, boolean seat, int wheelSize) {
		super();
		this.color = color;
		this.seat = seat;
		this.wheelSize = wheelSize;
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
	 * @return the seat
	 */
	public boolean isSeat() {
		return seat;
	}
	/**
	 * @param seat the seat to set
	 */
	public void setSeat(boolean seat) {
		this.seat = seat;
	}
	/**
	 * @return the wheelSize
	 */
	public int getWheelSize() {
		return wheelSize;
	}
	/**
	 * @param wheelSize the wheelSize to set
	 */
	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}
	
	public String makeNoise() {
		
		return "honk";
	}

	
}
