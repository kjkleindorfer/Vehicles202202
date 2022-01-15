/**
 * @author Benjamin Whisler - bwhisler1
 * CIS175 - Spring 2022
 * Jan 15, 2022
 */
package model;

public class Spaceship {
	private String name;
	private String country;
	private int crew;

	public Spaceship() {
		super();
	}
	
	public Spaceship(String name, String country, int crew) {
		super();
		this.name = name;
		this.country = country;
		this.crew = crew;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	@Override
	public String toString() {
		return "Spaceship " + name + " of " + country + ". Number of crew: " + crew;
	}
	
	public String makeNoise() {
		return "FWHOOM";
	}

}
