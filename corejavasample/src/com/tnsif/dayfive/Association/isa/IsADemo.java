package com.tnsif.dayfive.Association.isa;

public class IsADemo {
	public static void main(String[] args) {
		Employee Employee = new Employee("Sagar Pawar", 101, "IT");
        Manager Manager = new Manager("Ankit Kale", 201, "Hr", 8);

        System.out.println(Employee);
        System.out.println("---------------------------------------------------------------");
        System.out.println(Manager);

	}


}
