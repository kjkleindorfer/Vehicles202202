package model;
/**
 * Leonardo Saraiva FIlho - lsaraivafilho
 * CIS 175 - SPRING 2022
 * September 1ST, 2022	
 */

public class SUV {
    private String make;
	private String model;
	private String trim;
	private int year;
	private double miles;

    public SUV(){
        super();
    }
    
    public SUV(String make, String model, String trim, int year, double miles) {
		super();
		this.make = make;
		this.model = model;
		this.trim = trim;
		this.year = year;
		this.miles = miles;
	}

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
    @Override
    public String toString() {
    return make + ", " + model + ".\nTrim: " + trim + ".\nYear: " +
    year + ". Miles: " + miles;
    }
    public String makeNoise() {
    return "Nhee Nhee";
    }
}
