package adderapp.domain;

public class Adder {
	
	
	 private static final int INITIAL_VALUE = 0; // constant

	 private int total;

	 public Adder() {
		 reset();
	 }

	 public void reset() {
		 total = INITIAL_VALUE;
	 }
	 public void addToTotal(int operand) {
		 total = total + operand;
	 }
	 public int getTotal() {
		 return total;
	 }

}
