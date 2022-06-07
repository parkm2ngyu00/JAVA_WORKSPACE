package kr.ac.dankook.ace.dto;

public class Student extends Person {
	int id;

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
