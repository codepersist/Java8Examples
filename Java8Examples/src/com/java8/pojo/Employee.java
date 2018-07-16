package com.java8.pojo;

public class Employee {
	public int id;
	public String name;
	public String address;
	public int sal;

	public Employee(int id, String name, String address, int sal) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getSal() {
		return sal;
	}
	
	@Override
	public String toString()
	{
		return "Employee [ID: " + id + ", Name: " + name + ", Address: "  + address + ", Salary: " + sal + "]";
	}
	
	public static int compareBySal(Employee e1, Employee e2)
	{
		return (e1.getSal() - e2.getSal());
	}
}
