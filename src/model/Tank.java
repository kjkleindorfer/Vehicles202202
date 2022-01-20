package model;

/**
 * @author Al - asnyder7
 * CIS 175 - SPRING 2022
 * Jan 19, 2022	
 */

public class Tank extends Vehicle{

	//Properties
	private String model;
	private String trackType;
	private int crewSize;
	
	//Default Constructor
	public Tank() {
		super();
	}
	
	//Non-Default Construstor
	public Tank(String model, String trackType, int crewSize) {
		super();
		this.model = model;
		this.trackType = trackType;
		this.crewSize = crewSize;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTrackType() {
		return trackType;
	}

	public void setTrackType(String trackType) {
		this.trackType = trackType;
	}

	public int getCrewSize() {
		return crewSize;
	}

	public void setCrewSize(int crewSize) {
		this.crewSize = crewSize;
	}
	
	@Override
	public String toString() {
		return "Tank [model=" + model + ", trackType=" + trackType + ", crewSize=" + crewSize + "]";
	}

	public String makeNoise() {
		return "Rattle, rattle, rattle, rattle, Boom, Boom, BOOM";
	}

	
	
}
