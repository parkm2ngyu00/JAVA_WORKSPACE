
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HealthCalculatorMapManager {
	// member field
	private Map<Integer, IHealthCalculator> map = null;
	
	// constructor
	public HealthCalculatorMapManager() {
		this.map = new HashMap<>();
	}
	
	public HealthCalculatorMapManager(Map<Integer, IHealthCalculator> map) {
		this.map = map;
	}

	// setMap
	public void setMap(Map<Integer, IHealthCalculator> map) {
		this.map = map;
	}

	// getMap
	public Map<Integer, IHealthCalculator> getMap() {
		return this.map;
	}
	
	// add 
	public void add(int index, IHealthCalculator c) {
		this.map.put(index, c);
	}
	
	// remove all 
	public void removeAll() {
		this.map.clear();
	}

	// remove
	public void remove(int index) {
		this.map.remove(index);
	}
	
	// replace
	public void replace(int index, IHealthCalculator c) {
		this.map.replace(index, c);
	}
	
	// get
	public IHealthCalculator get(int index) {
		return this.map.get(index);
	}
	
	// getRandom - get a random element from the map
    public IHealthCalculator getRandom() { 
        int index = new Random().nextInt(map.keySet().size());
        Iterator<Integer> iter = map.keySet().iterator();
        for (int i = 0; i < index; i++) {
            iter.next();
        }
        return get(iter.next());
    } 

	// size
	public int size() {
		return this.map.size();
	}

	// find
	public List<IHealthCalculator> find(Predicate<? super IHealthCalculator> predicate) {
		List<IHealthCalculator> result = new ArrayList<>();
		for (IHealthCalculator c : this.map.values()) {
			if (c != null && predicate.test(c)) {
				result.add(c);
			}
		}
		return result;
	}
}
