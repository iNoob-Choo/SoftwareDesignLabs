package studentapp.domain;
//no input output in the studentlist
import java.util.ArrayList;

public class StudentList {
	
	private  ArrayList<Student> studentlist;
	//only main need static method n variables
	
	public StudentList(){
		studentlist=new ArrayList<Student>();
		
	}
	
	public String SearchStudent(String theName){
			if(studentlist.size()==0)
			{
				System.out.println("The list is empty");
			}else{
				
				boolean found=false;
				int i=0;
				
				while(i<studentlist.size() && !found)
				{
					if(studentlist.get(i).getName().equals(theName)){
							found=true;
							
							
					}else{
						i++;
					}
				}
				
				if(found)
					return Student.getName();
				else{
					return null;
				}
					
				
				
			
				
				
			}
			
	
		
	}
	
	public void AddStudent(String theName){
		Student newStudent=new Student();
		newStudent.setName(theName);
		studentlist.add(newStudent);
		
	}

}
