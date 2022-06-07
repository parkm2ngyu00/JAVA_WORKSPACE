package kr.ac.dankook.ace.dao;

import java.util.List;

import kr.ac.dankook.ace.dto.Animal;

public interface AnimalManager {
	void add(Animal a);
	void insert(int index, Animal a);
	void delete(String name);
	List<Animal> get();
	Animal get(int index);
	Animal get(String name);
	void replace(String name, Animal a);
}
