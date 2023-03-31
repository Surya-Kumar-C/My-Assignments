package week1.day1;

public class Car {
	public void applyBreak () {
		System.out.println("Applied Break");
	}
 public void soundHorn () {
	 System.out.println("Sound Horn");
	 //methods called in Bike class
 }
	 public static void main (String [] args) {
		 
	 Bike motion = new Bike();
	 motion.rightIndicator();
	 motion.leftIndicator();
 }
}
