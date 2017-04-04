package my.utar.edu;

import java.util.List;
import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		List<PersonalDetails> personList = new ArrayList<PersonalDetails>();
		AdminStaff adam = new AdminStaff(2000);
		ManagementStaff peter = new ManagementStaff(3000);
		AdminStaff mary = new AdminStaff(4000);
		SalesStaffAdapter london=new SalesStaffAdapter(3000,2,5);
		personList.add(adam);
		personList.add(peter);
		personList.add(mary);
		personList.add(london);
		for (PersonalDetails pd : personList) {
			System.out.println("Monthly bonus is " + pd.calculateBonus());
			pd.showRemainingLeave(15);
		}
	}

}
