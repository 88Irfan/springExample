package com.example.firstspringproject;

public class StudentDao implements DataAccess<Student> {
public String save(Student student) {
	System.out.println(student.getId());
	System.out.println(student.getAddress());
	System.out.println(student.getName());
	return "success";
}
}
