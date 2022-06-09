public class CalorieIntakeCalculator extends BMRCalculator {
	// member field
	Activity activity;
	
	// constructor
	public CalorieIntakeCalculator() {
		this(0, null, 0.0, 0.0, null);
	}

    public CalorieIntakeCalculator(int age, Gender gender, double weight, double height, Activity activity) {
		super(age, gender, weight, height);
		this.activity = activity;
    }
    
	// toString()
    @Override 
 	public String toString() { 
 		return "CalorieIntakeCalculator [age=" + age + ", gender=" + gender + ", weight=" + weight + ", height=" + height
 				+ ", activity=" + activity + ", calculate()=" + calculate() + "]"; 
 	}

    // https://bmi-calories.com/calorie-intake-calculator.html
    // SEDENTARY: BMR x 1.2
    // LIGHTLY_ACTIVE: BMR x 1.375
    // MODERATELY_ACTIVE: BMR x 1.55
    // VERY_ACTIVE: BMR x 1.725
    // EXTRA_ACTIVE: BMR x 1.9
    @Override
 	public double calculate() {
		switch (activity) {
		case SEDENTARY:
			return super.calculate() * 1.2;
		case LIGHTLY_ACTIVE:
			return super.calculate() * 1.375;
		case MODERATELY_ACTIVE:
			return super.calculate() * 1.55;
		case VERY_ACTIVE:
			return super.calculate() * 1.725;
		case EXTRA_ACTIVE:
			return super.calculate() * 1.9;
		default:
			return 0.0;
		}
	}
 	
    @Override
	public void getUserInput() {
		System.out.println("~~~~~Calorie Intake Calculator~~~~~");	
		System.out.print("Please enter age: ");
		age = UserInput.getInteger();
		System.out.print("Please enter gender [FEMALE, MALE]: ");
		gender = Gender.valueOf(UserInput.getString());
		System.out.print("Please enter weight (kg): ");
		weight = UserInput.getDouble();
		System.out.print("Please enter height (cm): ");
		height = UserInput.getDouble();
		System.out.print("Please enter Activity [SEDENTARY, LIGHTLY_ACTIVE, MODERATELY_ACTIVE, VERY_ACTIVE, EXTRA_ACTIVE]: ");
		activity = Activity.valueOf(UserInput.getString());
	}
    
    @Override
    public void setDataInput(PersonData person) {
    	super.setDataInput(person);
    	activity = person.activity();
    }
}
