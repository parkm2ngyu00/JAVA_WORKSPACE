
public class CalorieIntakeCalculator extends BMRCalculator {
	
	Activity activity;
	double CI;
	
	// default constructor
	public CalorieIntakeCalculator() {
		super(0, null, 0, 0);
		this.activity = null;
	}
	
	// constructor
	public CalorieIntakeCalculator(Activity activity, int age, 
			Gender gender, double weight, double height) {
		super(age, gender, weight, height);
		this.activity = activity;
	}
	
	// getter & setter
	public Activity getActivty() {
		return activity;
	}

	public void setActivty(Activity activity) {
		this.activity = activity;
	}
	
	// BMR ��� �� activity�� ���� CI ���
	// super.calculate() * 1.2; -> �̷������� ����ص� ��.
	public double calculate() {
		if (this.gender == Gender.MALE) {
			BMR = 66.4730 + (13.7516 * weight) + (5.0033 * height) - (6.7550 * age);
		} else {
			BMR = 655.0955 + (9.5634 * weight) + (1.8496 * height) - (4.6756 * age);
		}
		if (activity == Activity.SEDENTARY) {
			CI =  BMR * 1.2;
		} else if (activity == Activity.LIGHTLY_ACTIVE) {			
			CI = BMR * 1.375;
		} else if (activity == Activity.MODERATELY_ACTIVE) {			
			CI = BMR * 1.55;
		} else if (activity == Activity.VERY_ACTIVE) {			
			CI = BMR * 1.725;
		} else if (activity == Activity.EXTRA_ACTIVE) {			
			CI = BMR * 1.9;
		}
		return CI;
	}
	
	// user input
	@Override
	public void getUserInput() {
		int i, j;
		System.out.print("������ �Է��� �ּ���(���ڴ� 1, ���ڴ� 2) : ");
		i = UserInput.getIntegerBetween(1, 2);
		if (i == 1) {
			this.gender = Gender.MALE;
		} else if (i == 2) {
			this.gender = Gender.FEMALE;
		}
		System.out.print("���̸� �Է��� �ּ��� : ");
		age = UserInput.getInteger();
		System.out.print("�����Ը� �Է��� �ּ���(kg) : ");
		weight = UserInput.getDouble();
		System.out.print("Ű�� �Է��� �ּ���(cm) : ");
		height = UserInput.getDouble();
		System.out.print("����ϰ� ���� CI�� ���ڸ� �Է��� �ּ���(1.SEDENTARY, 2.LIGHTLY_ACTIVE, 3.MODERATELY_ACTIVE, 4.VERY_ACTIVE, 5.EXTRA_ACTIVE) : ");
		j = UserInput.getIntegerBetween(1, 5);
		switch (j) {
		case 1:
			activity = Activity.SEDENTARY;
			break;
		case 2:
			activity = Activity.LIGHTLY_ACTIVE;
			break;
		case 3:
			activity = Activity.MODERATELY_ACTIVE;
			break;
		case 4:
			activity = Activity.VERY_ACTIVE;
			break;
		case 5:
			activity = Activity.EXTRA_ACTIVE;
			break;
		}
	}
	
	// setDataInput
	@Override
	public void setDataInput(PersonData person) {
		age = person.age();
		gender = person.gender();
		weight = person.weight();
		height = person.height();
		activity = person.activity();
	}
	
	// toString
	@Override
	public String toString() {
		return "CalorieIntakeCalculator [activity=" + activity + ", CI=" + CI + "]";
	}
	
}
