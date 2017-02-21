package studentapp.ui;

import java.util.Scanner;


import studentapp.domain.*;

public class StudentApp {
	private static StudentList studentlist;
	private static Scanner scanner;
	
	public static void main(String[]args){
		studentlist=new StudentList();
		scanner=new Scanner(System.in);
		
		int choice;
		boolean error;
		
		do{
			System.out.println("Do you want to: ");
			System.out.println("1. Create new Student object");
			System.out.println("2. Search for a Student Object");
			System.out.println("1. Exit");
			System.out.print(" Enter your choice (1-3: ");
			choice=scanner.nextInt();
			
			error=false;
				switch(choice){
					case 1: addStudent();break;
					case 2: searchStudent();break;
					case 3: break;
					default: error=true;break;
				}
		
		
			if(error){
				System.out.println("Invalid choice.Please enter again");
			}
		
			System.out.println();
		}while(choice!=3);
	}
	
	
	public static void addStudent(){
		System.out.print("Enter student name: ");
		//clear previous enter 
		@SuppressWarnings("unused")
		String skip=scanner.nextLine();
		String theName=scanner.nextLine();
		studentlist.AddStudent(theName);
		
		
		
	}
	
	public static void searchStudent(){
		String student;
		System.out.print("Enter student name: ");
		//clear previous enter 
		@SuppressWarnings("unused")
		String skip=scanner.nextLine();
		String theName=scanner.nextLine();
		student=studentlist.SearchStudent(theName);
		System.out.println(student + "exist in the list");
		
		
	}

			

			
			
			
			
			
			
			
			
			
}

	
