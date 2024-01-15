package model;
//new vehicle
public class RC_Car{
	private int age;
	private String model;
	private String sound = "nyoooooooooom... battery low";
	
	public RC_Car(int age, String model, String sound) {
		super();
		this.age = age;
		this.model = model;
		this.sound = sound;
	}
	public RC_Car() {}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String makeNoise() {
		return this.sound;
	}
}
