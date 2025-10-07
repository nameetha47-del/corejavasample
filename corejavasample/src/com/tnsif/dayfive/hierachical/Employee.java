package com.tnsif.dayfive.hierachical;

public class Employee extends Person{
	private int EmpId;
    private float salary;
    private String dept;


    public Employee() {
            System.out.println("Employee Class Default Constructor");
    }


    public Employee(int EmpId, float salary, String dept) {
            this.EmpId = EmpId;
            this.salary = salary;
            this.dept = dept;
    }


    public Employee(String name, String city,int EmpId, float salary, String dept) {
            super(name,city);
            this.EmpId = EmpId;
            this.salary = salary;
            this.dept = dept;
    }


    public int getEmpId() {
            return EmpId;
    }


    public void setEmpId(int EmpId) {
            this.empId = EmpId;
    }


    public float getSalary() {
            return salary;
    }


    public void setSalary(float salary) {
            this.salary = salary;
    }


    public String getDept() {
            return dept;
    }


    public void setDept(String dept) {
            this.dept = dept;
    }


    @Override
    public String toString() {
            return "Employee [EmpId=" + EmpId + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
                            + ", getCity()=" + getCity() + "]";
    }
}