import java.util.Objects;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Person) {
			Person other = (Person)o;
			return this.name.equals(other.name) && this.age == other.age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
