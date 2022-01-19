package model;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Jan 18, 2022
 */
public class SemiTruck {
	private String make;
	private String model;
	private boolean crossCountry;
	
	public SemiTruck() {
		super();
	}
	
	public SemiTruck(String m, String mo, boolean cc) {
		this.make = m;
		this.model = mo;
		this.crossCountry = cc;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the crossCountry
	 */
	public boolean isCrossCountry() {
		return crossCountry;
	}

	/**
	 * @param crossCountry the crossCountry to set
	 */
	public void setCrossCountry(boolean crossCountry) {
		this.crossCountry = crossCountry;
	}
	
	public String makeNoise() {
		String semiNoise = "Erm Erm";
		return semiNoise;
	}
}
