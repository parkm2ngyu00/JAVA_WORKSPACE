
public class BMICalculator extends HealthCalculator {
	double weight;
	double height;
	double BMI;
	
	// default constructor
	public BMICalculator() {
		this.weight = 0;
		this.height = 0;
	}
	
	// constructor
	public BMICalculator(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	
	// getter & setter
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
		BMI = weight / (height * 0.01) / (height * 0.01);
		return BMI;
	}
	
	// user input
	@Override
	public void getUserInput() {
		System.out.print("몸무게를 입력해 주세요(kg) : ");
		this.weight = UserInput.getDouble();
		System.out.print("키를 입력해 주세요(cm) : ");
		this.height = UserInput.getDouble();
	}

	// toString
	@Override
	public String toString() {
		return "BMICalculator [weight=" + weight + ", height=" + height + ", BMI=" + BMI + "]";
	}
	
	
	
}
