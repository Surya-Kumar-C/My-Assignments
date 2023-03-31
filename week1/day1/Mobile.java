package week1.day1;


public class Mobile {
	public void makeCall () {
		String mobileModel = "Apple";
		float mobileWeight = 180.35f;
		System.out.println(mobileModel + mobileWeight);
	}
		
	public void sendMessage () {
		boolean fullCharged = true;
		int mobileCost = 80000;
		System.out.println(fullCharged);
		System.out.println(mobileCost);
	}
	

public static void main(String[] args) {
	
	Mobile device = new Mobile();
	device.makeCall();
	device.sendMessage();
	System.out.println("This is my mobile");
	
}
}
