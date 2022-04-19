package org.student;

import org.department.Department;

public class Student  extends Department {
	public void studentName(String St_name) {
		System.out.println(St_name);
	}
	public void studentDept(String St_Dept) {
		System.out.println(St_Dept);
	}
	public void studentId(int id) {
		System.out.println(id);
	}

	public static void main(String[] args) {
		
		Student cand = new Student();
		cand.collegeCode();
		cand.collegeName();
		cand.collegeRank();
		cand.deptName();
		cand.studentName("Sairmayee");
		cand.studentDept("IT");
		cand.studentId(732);
		

	}

}
