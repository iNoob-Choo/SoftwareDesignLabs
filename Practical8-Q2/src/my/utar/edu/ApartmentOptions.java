package my.utar.edu;

abstract class ApartmentOptions implements IApartment{


	IApartment tempApartment;

	public ApartmentOptions(IApartment apart){
		tempApartment=apart;
	}
	

	
}