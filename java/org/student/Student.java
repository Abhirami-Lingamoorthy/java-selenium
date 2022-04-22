package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Student name is Abhirami Lingamoorthy");
	}
public void studentDept()
{
	System.out.println("Student department is Computer science");
}
	public void studentId()
	{
		System.out.println("Student id is 10U28A101");
	}
	public static void main(String[] args) {
		Student year = new Student();
		year.studentDept();
		year.studentId();
		year.studentName();
		year.collegeCode();
		year.collegeName();
		year.collegeRank();
		year.deptName();
	
		
		
		

	}

}
