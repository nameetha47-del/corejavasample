package com.tnsif.dayeightteen;

public class Student implements Comparable<Student>  // ✅ Use generic type
{
	private int rollNo;
	private String name;
	private float per;

	public Student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}

	public Student() {
		super();
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}

	@Override
	public int hashCode() {   // ✅ Simplified and fixed
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(per);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		if (Float.compare(per, other.per) != 0)
			return false;
		if (name == null) {
			return other.name == null;
		} else return name.equals(other.name);
	}

	@Override
	public int compareTo(Student s2) {  // ✅ Generic Comparable used
		return this.name.compareTo(s2.name); // or use rollNo for sorting by roll number
	}
}
