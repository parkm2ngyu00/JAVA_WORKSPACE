package kr.ac.dankook.ace.dto;

public class Dog extends Animal {
	int type;

	public Dog(String name, int age, int type) {
		super(name, age);
		this.type = type;
	}

	@Override
	public String toString() {
		return "Dog [type=" + type + ", name=" + name + ", age=" + age + "]";
	}
}
