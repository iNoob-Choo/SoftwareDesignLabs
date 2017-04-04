package my.utar.edu;

public class SalesStaffAdapter extends PersonalDetails{
	
	SalesStaff salesstaff;
	
	public SalesStaffAdapter(int salesTotal,int numYearsOfTraining,int numSalesAssignment){
		 salesstaff=new SalesStaff(salesTotal,numYearsOfTraining,numSalesAssignment);
	}
	
	
	
	@Override
	public int calculateBonus() {
		// TODO Auto-generated method stub
		
		return salesstaff.calculateCommission();
	}

	//salesstaff 20 + number of sales assignments + number of years in training.

	@Override
	public void showRemainingLeave(int daysApplied) {
		// TODO Auto-generated method stub
		System.out.println("Leave remaining is : " + (20 + salesstaff.getNumSalesAssignment() + 
				salesstaff.getNumYearsTraining() ) + " days");
		
	}

}
