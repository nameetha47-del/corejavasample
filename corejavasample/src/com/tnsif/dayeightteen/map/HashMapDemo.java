package com.tnsif.dayeightteen.map;

import java.util.*;
import com.tnsif.dayeightteen.Student; // ✅ Correct import

class HashMapDemo 
{
	public static void main(String args[]) 
	{
		// HashMap with String key and Integer Value
		HashMap<String, Integer> bookMap = new HashMap<String, Integer>();
		bookMap.put("Let Us C", 320);
		bookMap.put("The Complete Reference C++", 450);
		bookMap.put("The Complete Reference Java 2", 465);
		bookMap.put("Python Programming", 599);
		bookMap.put("Application Development using Spring Boot", 600);

		System.out.println("Book Details are:");
		System.out.println(bookMap);

		System.out.println("\nTraversing a HashMap:");
		Set<Map.Entry<String, Integer>> set = bookMap.entrySet(); // ✅ Generic version
		Iterator<Map.Entry<String, Integer>> i = set.iterator();

		while (i.hasNext()) {
			Map.Entry<String, Integer> me = i.next();
			System.out.println(me.getKey() + ": " + me.getValue());
		}

		// HashMap with null keys and null values
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("Nitin", "nitin123@gmail.com");
		hm1.put("Deepak", null);
		hm1.put(null, "abc");
		hm1.put("Harish", null);
		hm1.put(null, null);
		hm1.put("Ravi", "ravi123@gmail.com");

		System.out.println("\nPerson HashMap with name and emailId:");
		System.out.println(hm1);

		// HashMap with Integer key and Student object as Value
		HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();
		studentMap.put(10001, new Student(1, "Aniket", 78));
		studentMap.put(10005, new Student(2, "Sumit", 84));
		studentMap.put(10006, new Student(3, "Amit", 81));
		studentMap.put(10003, new Student(5, "Ankit", 72));
		studentMap.put(10004, new Student(4, "Anil", 78));

		System.out.println("\nStudent Details are:");
		System.out.println(studentMap);
	}
}
