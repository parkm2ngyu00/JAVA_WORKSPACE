
public class BMICalculator {
	
	double weight; //kg
	double height; //cm
	double BMI;
	
	// default constructor
	public BMICalculator() {
		this.weight = 0;
		this.height = 0;
	}
	
	// constructor
	public BMICalculator(double weight, double height) {
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
	
	// calculate method
	public void calculate() {
		BMI = weight / (height * 0.01) / (height * 0.01);
	}
	
	// toString
	public String toString() {
		return "BMICalculator [weight=" + weight + ", height=" + height + ", BMI=" + BMI + "]";
	}
	
	// getUserInput
	public void getUserInput() {
		System.out.print("몸무게를 입력해주세요(kg): ");
		this.weight = UserInput.getDouble(); // UserInput class 에 getDouble method 사용
		System.out.print("키를 입력해주세요(cm): ");
		this.height = UserInput.getDouble();
	}
	
}
