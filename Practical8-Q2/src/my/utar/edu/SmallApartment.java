package my.utar.edu;

public class SmallApartment extends AbstractApartment {
	public SmallApartment(int aptNumber) {
		super(aptNumber);
	}

	public int getPrice() {
		return 30000;
	}
}