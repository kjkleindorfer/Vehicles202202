package model;
//added by Kelli

//confirm that your course comment appears here

public class Car {
	private String name;
	private String color;
	private int age;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	public String makeNoise() {
		return "Beep!  Beep!";
	}
}