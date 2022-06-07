package kr.ac.dankook.ace.dao;

import java.util.List;

import kr.ac.dankook.ace.dto.Person;

public interface PersonManager {
	void add(Person p);
	void insert(int index, Person p);
	void delete(String name);
	List<Person> get();
	Person get(int index);
	Person get(String name);
	void replace(String name, Person p);
}
