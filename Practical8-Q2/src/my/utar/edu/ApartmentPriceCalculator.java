package my.utar.edu;

public class ApartmentPriceCalculator {
	
	public static void main(String[] args){
		

		ApartmentOptions StdwithGarden=new ApartmentWithGarden(new StandardApartment(1111));
		ApartmentOptions StdwithKLCC=new ApartmentWithKLCC(new StandardApartment(111));
		
		ApartmentOptions SmallwithGarden=new ApartmentWithGarden(new SmallApartment(1111));
		ApartmentOptions SmallwithKLCC=new ApartmentWithKLCC(new SmallApartment(1111));
		
		System.out.println("Standard with Garden: " + StdwithGarden.getPrice());
		System.out.println("Standard with KLCC: " + StdwithKLCC.getPrice());
		System.out.println("Small with Garden: " + SmallwithGarden.getPrice());
		System.out.println("Small with KLCC: " + SmallwithKLCC.getPrice());
		
	
		
		
		

		
		
		
		
		
	}

}
