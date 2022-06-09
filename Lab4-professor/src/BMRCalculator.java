public class BMRCalculator implements IHealthCalculator {
	// member field
	protected int age;
	protected Gender gender;
	protected double weight;
	protected double height;
	
	// constructor
	public BMRCalculator() {
		this(0, null, 0.0, 0.0);
	}

	public BMRCalculator(int age, Gender gender, double weight, double height) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}

	// getter/setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// toString()
	@Override
	public String toString() {
		return "BMRCalculator [age=" + age + ", gender=" + gender + ", weight=" + weight + ", height=" + height
				+ ", calculate()=" + calculate() + "]";
	}
	
	// https://bmi-calories.com/bmr-calculator.html
    // Men: BMR = 66.4730 + (13.7516 * weight) + (5.0033 * height) - (6.7550 * age)
    // Women: BMR = 655.0955 + (9.5634 * weight) + (1.8496 * height) - (4.6756 * age)
	@Override
 	public double calculate() {
		if (this.gender == Gender.MALE)
			return 66.4730 + (13.7516 * weight) + (5.0033 * height) - (6.7550 * age);
		else 
			return 655.0955 + (9.5634 * weight) + (1.8496 * height) - (4.6756 * age);
	}
 	
	@Override
	public void getUserInput() {
		System.out.println("~~~~~Basal Metabolic Rate Calculator~~~~~");	
		System.out.print("Please enter age: ");
		age = UserInput.getInteger();
		System.out.print("Please enter gender [FEMALE, MALE]: ");
		gender = Gender.valueOf(UserInput.getString());
		System.out.print("Please enter weight (kg): ");
		weight = UserInput.getDouble();
		System.out.print("Please enter height (cm): ");
		height = UserInput.getDouble();
	}
	
	@Override
	public void setDataInput(PersonData person) {
		age = person.age();
		gender = person.gender();
		weight = person.weight();		
		height = person.height();
	}
}
