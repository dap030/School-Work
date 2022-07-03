//Desmond Padilla -- CMIS242-6980 -- JULY 3, 2022

import java.text.DecimalFormat;

public class Weight {
	
	//variables
	private static final int OUNCES_IN_A_POUND = 16;
	private int pounds;
	private double ounces;	
	
	//Constructor
	public Weight (int pounds, double ounces) {
		this.pounds = pounds;
		this.ounces = ounces;
		normalize();
	}
	
	//calculate total ounces method
	public double toOunces() {
		return (OUNCES_IN_A_POUND * this.pounds) + this.ounces;
	}
	
	
	//method should ensure that the number of ounces is less than the number of ounces in a pound.
	private void normalize() {		
		this.pounds += Math.floor(this.ounces / OUNCES_IN_A_POUND);
			while(this.ounces >= OUNCES_IN_A_POUND) {
			this.ounces -= OUNCES_IN_A_POUND;
			}	
	}
		
	
	//method to determine if the object is greater or less than the initialized values. 
	public boolean lessThan(Weight weight) {
		return this.toOunces() < weight.toOunces();
	}
	
	
	//method to add the object’s weight values to the initialized values. 
	public void addTo (Weight weight){ 
		this.pounds += weight.pounds;
		this.ounces += weight.ounces;
	}
	
	
	//method to avg the sum
	public void findAvg(int amountOfValues) {
		return;
	}
	
	
	//toString method
	DecimalFormat df = new DecimalFormat(".00");
	@Override
	public String toString() {
		return "Pounds = " + this.pounds + ",Total Ounces= " + df.format(this.ounces);
	}
}

