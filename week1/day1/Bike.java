package week1.day1;

public class Bike {
	
		public void rightIndicator () {
			System.out.println("Right turn");
		}
		
	 public void leftIndicator () {
		 System.out.println("Left turn");
	 }
	public static void main (String [] args) {
		
		Car function = new Car ();
		function.applyBreak();
		function.soundHorn();
	
	}

}
