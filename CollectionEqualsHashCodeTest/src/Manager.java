import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Manager<T, S> {
	
	private List<T> list = null;
	private T[] arr = null;
	private int count = 0;
	private S item = null;
	private static final int MAX_COUNT = 5;
	
	public Manager() {
		super();
		this.list = new ArrayList<>();
		this.arr = (T[])new Object[5];
		this.item = (S)new Object();
	}
	
	public Manager(List<T> list, T[] arr) {
		super();
		this.list = list;
		this.arr = arr;
	}
	
	public void add(T t) {
		this.list.add(t);
		if (count < MAX_COUNT)this.arr[count++] = t;
	}
	
	public void print() {
		this.list.forEach(System.out::println);
		System.out.println(Arrays.toString(arr));
	}
	
}
