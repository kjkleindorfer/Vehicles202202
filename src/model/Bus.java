package model;

/**
 * @author Joe Shilkaitis - jshilkaitis
 * CIS175 - Fall 2022
 * Aug 29, 2022
 */
public class Bus {
	int seats;
	boolean schoolBus;
	boolean flatNose;

	public Bus(int seats, boolean schoolBus, boolean flatNose) {
		super();
		this.seats = seats;
		this.schoolBus = schoolBus;
		this.flatNose = flatNose;
	}

	public String makeNoise() {
		return "BBRRRRMMM";
	}

	/**
	 * @return the seats
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * @param seats the seats to set
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * @return the schoolBus
	 */
	public boolean isSchoolBus() {
		return schoolBus;
	}

	/**
	 * @param schoolBus the schoolBus to set
	 */
	public void setSchoolBus(boolean schoolBus) {
		this.schoolBus = schoolBus;
	}

	/**
	 * @return the flatNose
	 */
	public boolean isFlatNose() {
		return flatNose;
	}

	/**
	 * @param flatNose the flatNose to set
	 */
	public void setFlatNose(boolean flatNose) {
		this.flatNose = flatNose;
	}

}
