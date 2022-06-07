package com.my.hello;

public class Hello {
	String toWhom;

	public Hello() {
		this("Hello");
	}
	
	public Hello(String toWhom) {
		this.toWhom = toWhom;
	}
	
	public void sayHello() {
		System.out.println("Hello " + toWhom);
	}
}
