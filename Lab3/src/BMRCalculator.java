
public class BMRCalculator extends HealthCalculator {
	int age;
	Gender gender;
	double weight;
	double height;
	double BMR;
	
	// default constructor
	public BMRCalculator() {
		this.age = 0;
		this.gender = null;
		this.weight = 0;
		this.height = 0;
	}
	
	// constructor
	public BMRCalculator(int age, Gender gender, double weight, double height) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}
	
	// getter & setter
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
	
	// calculate
	@Override
	public double calculate() {
		if (this.gender == Gender.MALE) {
			BMR = 66.4730 + (13.7516 * weight) + (5.0033 * height) - (6.7550 * age);
		} else {
			BMR = 655.0955 + (9.5634 * weight) + (1.8496 * height) - (4.6756 * age);
		}
		return BMR;
	}

	// user input
	@Override
	public void getUserInput() {
		int i;
		System.out.print("성별을 입력해 주세요(남자는 1, 여자는 2) : ");
		i = UserInput.getIntegerBetween(1, 2);
		if (i == 1) {
			this.gender = Gender.MALE;
		} else if (i == 2) {
			this.gender = Gender.FEMALE;
		}
		System.out.print("나이를 입력해 주세요 : ");
		age = UserInput.getInteger();
		System.out.print("몸무게를 입력해 주세요(kg) : ");
		weight = UserInput.getDouble();
		System.out.print("키를 입력해 주세요(cm) : ");
		height = UserInput.getDouble();
	}
	
	// toString
	@Override
	public String toString() {
		return "BMRCalculator [age=" + age + ", gender=" + gender + ", weight=" + weight + ", height=" + height
				+ ", BMR=" + BMR + "]";
	}
	
}
