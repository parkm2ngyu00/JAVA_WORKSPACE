// Class: BMICalculator
public class BMICalculator implements IHealthCalculator {	
	// member field
	double weight;
	double height;
	
 	// constructor
	public BMICalculator() {
		this(0.0, 0.0);
	}

    public BMICalculator(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}

    // getter/setter
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

	@Override
	public String toString() {
		return "BMICalculator [weight=" + weight + ", height=" + height + ", calculate()=" + calculate() + ", BMI=" + BMI.getIndex(calculate()) + "]";
	}

	// https://bmi-calories.com/bmi-calculator.html
	@Override
    public double calculate() {
    	return weight / (height * 0.01) / (height * 0.01);
 	}

	@Override
	public void getUserInput() {
		System.out.println("~~~~~Body Mass Index Calculator~~~~~");	
		System.out.print("Please enter weight (kg): ");
		weight = UserInput.getDouble();
		System.out.print("Please enter height (cm): ");
		height = UserInput.getDouble();
	}

	@Override
	public void setDataInput(PersonData person) {
		weight = person.weight();
		height = person.height();		
	}
}