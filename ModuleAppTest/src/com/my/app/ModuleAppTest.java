package com.my.app;

import java.util.ArrayList;
import java.util.List;

import com.my.hello.Hello;

import kr.ac.dankook.ace.dao.AnimalListManager;
import kr.ac.dankook.ace.dao.AnimalManager;
import kr.ac.dankook.ace.dto.Animal;
import kr.ac.dankook.ace.dto.Cat;
import kr.ac.dankook.ace.dto.Dog;

public class ModuleAppTest {

	public static void main(String[] args) {
		Hello hello = new Hello("Java22-3");
		hello.sayHello();
		
		List<Animal> data = new ArrayList<>() {{
			add(new Animal("P", 10));
			add(new Animal("K", 20));
			add(new Animal("S", 30));
			add(new Dog("C", 3, 1));
			add(new Cat("T", 5, "cute"));
		}};
		
		AnimalManager manager = new AnimalListManager(data);		
		manager.add(new Cat("V", 7, "pretty"));
		manager.get().forEach(System.out::println);
	}

}
