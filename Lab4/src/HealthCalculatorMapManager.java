import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;

public class HealthCalculatorMapManager {
	
	private Map<Integer, IHealthCalculator> map = null;
	
	public HealthCalculatorMapManager () {
		this.map = new HashMap<> ();
	}

	public Map<Integer, IHealthCalculator> getMap() {
		return map;
	}

	public void setMap(Map<Integer, IHealthCalculator> map) {
		this.map = map;
	}
	
	public void add(int index, IHealthCalculator c) {
		map.put(index, c);
	}
	
	public void removeAll() {
		map.clear();
	}
	
	public void remove(int index) {
		map.remove(index);
	}
	
	public void replace(int index, IHealthCalculator c) {
		map.remove(index);
		map.put(index, c);
	}
	
	public IHealthCalculator get(int index) {
		return map.get(index);
	}
	
	public IHealthCalculator getRandom() {
		Random random = new Random();
		int i = random.nextInt(4);
		return map.get(i);
	}
	
	public int size() {
		return map.size();
	}
	
	// hashCode¿¡ µû¸¥ predicate
	public Map<Integer, IHealthCalculator> find(Predicate<? super IHealthCalculator> predicate) {
		predicate = (p1) -> p1.hashCode() >= 531885035;
		for (int i = 0; i < 4; i++) {
			if (predicate.test(map.get(i)))
				map.remove(i);
		}
		return map;
	}
}
