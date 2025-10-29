package com.tnsif.dayseventeen.userdefineobjects;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String args[]) {
		Set<Student> StudentSet = new HashSet<Student>();
		addElements(StudentSet);
		System.out.println(StudentSet);		
	}

	static void addElements(Set<Student> StudentSet) {

		Student s1 = new Student("Pooja",78);
		StudentSet.add(s1);
		s1 = new Student("Nikita",66);
		StudentSet.add(s1);
		s1 = new Student( "Deepa",73);
		StudentSet.add(s1);
		s1 = new Student("Neha",81);
		StudentSet.add(s1);
		s1 = new Student("Neha",81); 
		StudentSet.add(s1); //duplicate element can't insert

	}

}