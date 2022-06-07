package kr.ac.dankook.ace.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kr.ac.dankook.ace.dto.Person;

public class PersonListManager implements PersonManager {
	
	List<Person> list;

	public PersonListManager() {
		this(new ArrayList<>());
	}
	
	public PersonListManager(List<Person> list) {
		this.list = list;
	}
	
	@Override
	public void add(Person p) {
		list.add(p);
	}

	@Override
	public void insert(int index, Person p) {
		list.add(index, p);
	}

	@Override
	public void delete(String name) {
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			if (p.getName().equals(name)) {
				it.remove();
			}
		}
	}

	@Override
	public List<Person> get() {
		return list;
	}

	@Override
	public Person get(int index) {
		return list.get(index);
	}

	@Override
	public Person get(String name) {
		Person person = null;
		for (Person p : list) {
			if (p.getName().equals(name)) {
				person = p;
				break;
			}
		}
		return person;
	}

	@Override
	public void replace(String name, Person p) {
		int index = list.indexOf(get(name));
		list.set(index, p);
	}

}
