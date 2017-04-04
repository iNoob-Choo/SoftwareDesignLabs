package my.utar.edu;

public class ApartmentWithGarden extends ApartmentOptions {

	public ApartmentWithGarden(IApartment apart) {
		super(apart);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int getPrice(){
		return tempApartment.getPrice()+5000;
	}
}
