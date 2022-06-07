
public class Person {
	String name;
	int age;
	double weight;
	double height;
	Gender gender;
	
	public Person(String name, int age, double weight, double height, Gender gender) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + ", gender="
				+ gender + "]";
	}
	
}
