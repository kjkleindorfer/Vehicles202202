/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Jan 11, 2022
**/
package model;

/**
 * @author jake
 *
 */
public class Plane {
	private String name;
	private String color;
	private int age;

	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plane(String name, String color, int age) {
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
		return "Plane [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	public String makeNoise() {
		return "Nyoooom";
	}
}