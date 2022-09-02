package model;

public class Jet {
	
	private String model;
	private String yearDeployed;
	private String assignedPilot;
	
	public Jet(String model, String yearDeployed, String assignedPilot) {
		setModel(model);
		setYearDeployed(yearDeployed);
		setAssignedPilot(assignedPilot);
	}
	
	public Jet() {
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYearDeployed() {
		return yearDeployed;
	}

	public void setYearDeployed(String yearDeployed) {
		this.yearDeployed = yearDeployed;
	}

	public String getAssignedPilot() {
		return assignedPilot;
	}

	public void setAssignedPilot(String assignedPilot) {
		this.assignedPilot = assignedPilot;
	}

	public String makeNoise() {
		String jetNoise = "Fwoooosh!";
		return jetNoise;
	}

}
