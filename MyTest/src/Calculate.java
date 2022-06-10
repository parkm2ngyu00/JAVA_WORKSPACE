import java.util.Comparator;

public class Calculate implements Comparator {
	
	int x;
	int y;
	
	Calculate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int add() {
		return x + y;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
