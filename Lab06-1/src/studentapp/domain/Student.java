package studentapp.domain;

public class Student {
	
	private String name;
	 public Student() { // constructor
		 setName("");
	 }
	 public void setName(String n) { // setter method
		 name = n;
	 }
	 public String getName() { // getter method
		 return name;
	 }

}
