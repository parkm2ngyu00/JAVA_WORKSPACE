import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainTest {
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person(30, "Jason"));
		people.add(new Person(10, "Tony"));
		people.add(new Person(20, "Kevin"));
		people.add(new Person(20, "Ethan"));
		
		System.out.println("foreach");
		for (Person person : people) {
			System.out.println(person);
		}
		
		System.out.println("\nlambda");
		people.forEach((p) -> System.out.println(p));
		
		System.out.println("\nmethod reference (:: operator)");
		people.forEach(System.out::println);
		
		System.out.println("\nConsumer & lambda");
		Consumer<Person> print = p -> System.out.println(p);
		people.forEach(print);
		
		System.out.println("\nConsumer & anonymous class");
		Consumer<Person> print2 = new Consumer<>() {
			@Override
			public void accept(Person t) {
				System.out.println(t);
			}
		};
		people.forEach(print2);
		
		Function<Double, Double> sq = (Double x) -> x * x; // lambda 
		double result = sq.apply(3.3);
		System.out.println(result); // 3.3 * 3.3 = 10.889999999
		
		BiFunction<Integer, Integer, Integer> sum2 = MainTest::sum;
		int result2 = sum2.apply(3, 2); // 3 + 2 = 5
		System.out.println(result2);
		
		people.sort(null);
		System.out.println("\nsort by default");
		people.forEach(System.out::println);
		
		Comparator<Person> byName = (p1, p2) -> p1.getName().compareTo(p2.getName());  
		people.sort(byName);
		System.out.println("\nsort by Name");
		people.forEach(System.out::println);
		
		Comparator<Person> byAge = Comparator.comparing(Person::getAge);
		people.sort(byAge);
		System.out.println("\nsort by Age");
		people.forEach(System.out::println);
		
		people.sort(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		System.out.println("\nsort by Name anonymous class");
		people.forEach(System.out::println);
		
		Predicate<Person> ageGTE20 = new Predicate<Person>() {
			@Override
			public boolean test(Person t) {			
				return t.getAge() >= 20;
			}
		};
		System.out.println("\nPredicate ageGTE20");
		for (Person p : people) {
			if (ageGTE20.test(p)) {
				System.out.println(p);
			}
		}
	}
	
}
