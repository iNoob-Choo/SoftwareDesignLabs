package my.utar.edu;

public class ApartmentWithKLCC extends ApartmentOptions {

	

	public ApartmentWithKLCC(IApartment apart) {
		super(apart);
		// TODO Auto-generated constructor stub
	}

	public int getPrice(){
		return tempApartment.getPrice() +1500;
	}
}
