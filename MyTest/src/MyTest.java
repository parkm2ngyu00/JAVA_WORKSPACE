
public class MyTest {
	
	static void swap(int[] a, int[] b) {
		int temp;
		temp = a[0];
		a[0] = b[0];
		b[0] = temp;
	}
	
	public static void main(String[] args) {
		int[] a = {20};
		int[] b = {10};
		swap(a, b);
		System.out.printf("%d %d", a[0], b[0]);
	}

}
