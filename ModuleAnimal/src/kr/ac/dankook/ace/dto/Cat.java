package kr.ac.dankook.ace.dto;

public class Cat extends Animal {
	String character;

	public Cat(String name, int age, String character) {
		super(name, age);
		this.character = character;
	}

	@Override
	public String toString() {
		return "Cat [character=" + character + ", name=" + name + ", age=" + age + "]";
	}
}
