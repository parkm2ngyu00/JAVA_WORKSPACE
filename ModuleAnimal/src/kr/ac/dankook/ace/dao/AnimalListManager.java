package kr.ac.dankook.ace.dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kr.ac.dankook.ace.dto.Animal;

public class AnimalListManager implements AnimalManager {
	List<Animal> list;

	public AnimalListManager() {
		this(new ArrayList<>());
	}
	
	public AnimalListManager(List<Animal> list) {
		this.list = list;
	}

	@Override
	public void add(Animal a) {
		list.add(a);
	}

	@Override
	public void insert(int index, Animal a) {
		list.add(index, a);
	}

	@Override
	public void delete(String name) {
		/*Iterator<Animal> it = list.iterator();
		while (it.hasNext()) {
			Animal a = it.next();
			if (a.getName().equals(name)) {
				it.remove();
			}
		}*/
		list.remove(get(name));
	}

	@Override
	public List<Animal> get() {
		return list;
	}

	@Override
	public Animal get(int index) {
		return list.get(index);
	}

	@Override
	public Animal get(String name) {
		Animal animal = null;
		for (Animal a : list) {
			if (a != null && a.getName().equals(name)) {
				animal = a;
				break;
			}
		}
		return animal;
	}

	@Override
	public void replace(String name, Animal a) {
		int index = list.indexOf(get(name));
		list.set(index, a);
	}
	
}
