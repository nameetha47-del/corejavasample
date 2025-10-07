package com.tnsif.dayfive.Association.hasa;

public class Executor {
	
	public static void main(String[] args) {
		Address Address = new Address("405 Laxmi Enclave, Pandit Colony", "Nashik", "Maharashtra", "422003");
        Person Person = new Person("Aniket Pawar", Address);
        Person.displayInfo();

	}

}
