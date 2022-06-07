
public class LabTest {
	
	static int sum(int[] numbers) {
		int total = 0;
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}
	
	static int[] makeArray() {
		return new int[] {1, 2, 3, 4, 5};
	}

	public static void main(String[] args) {
		/*
		int [] numbers = {1, 2, 3, 4, 5};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// foreach
		for (int number : numbers)
			System.out.println(number);

		String[] names= {"CE", "SW", "MSE", "IS"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// foreach
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println(sum(new int[] {5, 4, 3, 2, 1}));
		int[] numbers2 = makeArray();
		for (int number : numbers2) {
			System.out.println(number);
		}
		String[] stringNumbers = {"1", "2", "3"};
		int sum = 0;
		for (int i = 0; i < stringNumbers.length; i++) {
			sum += Double.parseDouble(stringNumbers[i]);
		}
		System.out.println("total=" + sum);
 	}
 	*/
		for (var day : Day.values()) {
			System.out.println(day);
		}
		Day today = Day.THURSDAY;
		System.out.println("today:" + today);
		Day day = Day.valueOf("MONDAY"); // String -> enum Day
		System.out.println(day);
		System.out.println(day.ordinal()); // index
		for (var month : Month.values()) {
			System.out.println(month.getMonth());
		}
	}
}
