package model;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Jan 20, 2022
 */

public class Van {

	// Attributes
	private int numberOfWindows;
	private boolean airbrushedMural;
	private String interiorSurfaceMaterial;
	
	// Constructors
	public Van() {
		super();
	}
	public Van(int numberOfWindows, boolean airbrushedMural, String interiorSurfaceMaterial) {
		super();
		this.numberOfWindows = numberOfWindows;
		this.airbrushedMural = airbrushedMural;
		this.interiorSurfaceMaterial = interiorSurfaceMaterial;
	}
	
	// Getters & setters
	public int getNumberOfWindows() {
		return numberOfWindows;
	}
	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}
	public boolean isAirbrushedMural() {
		return airbrushedMural;
	}
	public void setAirbrushedMural(boolean airbrushedMural) {
		this.airbrushedMural = airbrushedMural;
	}
	public String getInteriorSurfaceMaterial() {
		return interiorSurfaceMaterial;
	}
	public void setInteriorSurfaceMaterial(String interiorSurfaceMaterial) {
		this.interiorSurfaceMaterial = interiorSurfaceMaterial;
	}
	
	// Methods
	public String makeNoise() {
		return "beep beep";
	}
	@Override
	public String toString() {
		return "Van [numberOfWindows=" + numberOfWindows + ", airbrushedMural=" + airbrushedMural
				+ ", interiorSurfaceMaterial=" + interiorSurfaceMaterial + "]";
	}

}