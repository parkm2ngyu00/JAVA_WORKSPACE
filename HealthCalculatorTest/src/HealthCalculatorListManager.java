
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HealthCalculatorListManager {
	// member field
	private List<IHealthCalculator> list = null;
	
	// constructor
	public HealthCalculatorListManager() {
		this.list = new ArrayList<>();
	}
	
	public HealthCalculatorListManager(List<IHealthCalculator> list) {
		this.list = list;
	}

	// getList
	public List<IHealthCalculator> getList() {
		return list;
	}

	// setList
	public void setList(List<IHealthCalculator> list) {
		this.list = list;
	}

	// add 
	public void add(IHealthCalculator c) {
		this.list.add(c);
	}
	
	// insert
	void insert(int index, IHealthCalculator c) {
		this.list.add(index, c);
	}
	
	// remove all 
	public void removeAll() {
		this.list.clear();
	}
	
	// remove 
	public void remove(IHealthCalculator other) {
		Iterator<IHealthCalculator> it = (Iterator<IHealthCalculator>) this.list.iterator();
		while (it.hasNext()) {
		    Object t = it.next();
		    if (t == other) {
				it.remove();
		    }
		}
	}
	
	// replace
	public void replace(int index, IHealthCalculator other) {
		this.list.set(index, other);
	}
	
	// get
	public IHealthCalculator get(int index) {
		return this.list.get(index);
	}
	
	// find
	public List<IHealthCalculator> find(Predicate<? super IHealthCalculator> predicate) {
		return this.list.stream().filter(predicate).collect(Collectors.toList());
	}
	
	// find 
	public IHealthCalculator find(IHealthCalculator other) {
		Iterator<IHealthCalculator> it = (Iterator<IHealthCalculator>) this.list.iterator();
		while (it.hasNext()) {
			IHealthCalculator t = it.next();
		    if (t == other) {
		    	return t;
		    }
		}
		return null;
	}

	// getRandom - get a random element from the list
    public IHealthCalculator getRandom() { 
        return get((int)(Math.random()*size())); 
    } 
    
	// size
	public int size() {
		return this.list.size();
	}
	
	// sort by Mode
	public void sort() {
		this.list.sort(new Comparator<IHealthCalculator>() {

			@Override
			public int compare(IHealthCalculator o1, IHealthCalculator o2) {
				return (int)(o1.calculate() - o2.calculate());
			}
			
		});
	}

	@Override
	public String toString() {
		return "HealthCalculatorListManager [list=" + list + "]";
	}

	public void print() {
		list.forEach(System.out::println);
	}
	
}
