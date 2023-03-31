package week1.day2;

public class Returntype {

public int tabPrice (){
	int tabPrice=30000;
	return tabPrice;
}
	
public String brandName () {
	String brandName = "Oneplus";
	return brandName;
	
}
	public static void main(String[] args) {
		
		Returntype product = new Returntype();
		System.out.println(product.tabPrice());
		System.out.println(product.brandName());
		String result = product.brandName(); //Manipulation
		System.out.println(result+ "is awesome");
		}

}
