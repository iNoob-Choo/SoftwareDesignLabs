package studentapp.domain;
public class AppController {

 private StudentList studentList;

 public AppController() {
	 studentList = new StudentList();
 }

 public void addStudent(String name) {
	 studentList.add(name);
 }

 public Student searchStudent(String name) {
	 return studentList.search(name);
 }
}
