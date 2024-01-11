package model;

public class SportsCar {

	// Instance Variables 
  private String brand;
  private String model;
  private int horsePower;

	// Constructor
public SportsCar {
}

public SportsCar(String brand, String model, int horsePower) {
  this.brand = brand;
  this.model = model;
  this.horsePower = horsePower;
}

	// Getter and Setter method
public String getBrand() {
  return brand;
}

public void setBrand(String brand) {
  this.brand = brand;
}

public String getModel() {
  return model;
}

public int getHorsePower() {
  return horsePower;
}

public void setHorsePower(int horsePower) {
  this.horsePower = horsePower;
}

public String makeNoise() {
  return "Vroom Vroom Vrooom!";
}

}
