package kr.ac.dankook.ace.dto;

public class Staff extends Person {
	String department;

	public Staff(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}

	@Override
	public String toString() {
		return "Staff [department=" + department + ", name=" + name + ", age=" + age + "]";
	}
}
