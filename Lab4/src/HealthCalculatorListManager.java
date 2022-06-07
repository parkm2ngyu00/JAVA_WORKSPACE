import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class HealthCalculatorListManager {
	
	private List<IHealthCalculator> list = null;
	private List<IHealthCalculator> list2 = new ArrayList<> ();
	
	public HealthCalculatorListManager () {
		this.list = new ArrayList<> ();
	}
	
	public List<IHealthCalculator> getList() {
		return list;
	}

	public void setList(List<IHealthCalculator> list) {
		this.list = list;
	}
	
	public void add(IHealthCalculator c) {
		list.add(c);
	}
	
	public void insert(int index, IHealthCalculator c) {
		list.add(index, c);
	}
	
	public void removeAll() {
		list.removeAll(list);
	}
	
	public void remove(IHealthCalculator c) {
		list.remove(c);
	}
	
	public void replace(int index, IHealthCalculator c) {
		 list.remove(index);
		 list.add(index, c);
	}
	
	public IHealthCalculator get(int index) {
		return list.get(index);
	}
	
	// hashCode¿¡ µû¸¥ predicate
	public List<IHealthCalculator> find(Predicate<? super IHealthCalculator> predicate) {
		predicate = (p1) -> p1.hashCode() >= 1160460865;
		for (IHealthCalculator I : list) {
			if (predicate.test(I))
				list2.add(I);
		}
		return list2;
	}
	
	public IHealthCalculator getRandom() {
		Random random = new Random();
		int i = random.nextInt(4);
		return list.get(i);
	}
	
	public int size() {
		return list.size();
	}
	
	public void sort() {
		Comparator<IHealthCalculator> byCal = Comparator.comparing(IHealthCalculator::calculate);
		list.sort(byCal);
	}
	
}
