/**
 * 
 */
package model;

/**
 * @author rossk - rkromminga
 * CIS175 - Spring 2022
 * Jan 19, 2022
 */
public class Motorcycle {
	private static String _make;
	private static String _model;
	private static String _year;
	public Motorcycle() {
		_make = "No type given";
		_model = "No model given";
		_year = "No year given";
	}
	public Motorcycle(String make, String model, String year) {
		_make = make;
		_model = model;
		_year = year;
	}
	public String makeNoise() {
		return "Vroom";
	}
	public String getMake() {
		return _make;
	}
	public String getModel() {
		return _model;
	}
	public String getYear() {
		return _year;
	}
	public void setMake(String type) {
		_make = type;
	}
	public void setModel(String model) {
		_model = model;
	}
	public void setYear(String year) {
		_year = year;
	}
}
