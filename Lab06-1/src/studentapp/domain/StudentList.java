package studentapp.domain;
import java.util.ArrayList;
public class StudentList {

	private ArrayList<Student> studentlist;

	public StudentList() {
		studentlist = new ArrayList<Student>();
	}

 public void add(String name) {
		Student newStudent=new Student();
		newStudent.setName(name);
		studentlist.add(newStudent);
	 
	
 }

 public Student search(String name) {
	 
	 if(studentlist.size()==0)
		{
			System.out.println("The list is empty");
		}else{
			
			boolean found=false;
			int i=0;
			Student student=new Student();
			
			while(i<studentlist.size() && !found)
			{
			
				if(studentlist.get(i).getName().equals(name)){
						found=true;
						
						
						
				}else{
					i++;
				}
			}
			
			if(found){
				student=studentlist.get(i);
				return student;
			}
			
			else{
				return null;
			}
				
			
		}
	return null;
	 
	
 }
}
