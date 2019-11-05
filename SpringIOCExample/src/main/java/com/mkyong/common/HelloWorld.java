package com.mkyong.common;

import java.util.Set;

public class HelloWorld {
	private String name;
	private Set<String> studentsData;

	public void setName(String name) {
		this.name = name;
	}

	public void setStudentsData(Set<String> studentsData) {
		this.studentsData = studentsData;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
		if (studentsData != null) {
			System.out.println("total students are :" + studentsData.size());
			for (String student : studentsData) {
				System.out.println(student);
			}
		}
	}

}