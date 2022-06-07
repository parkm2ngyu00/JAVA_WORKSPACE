
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
		System.out.print("�����Ը� �Է����ּ���(kg): ");
		this.weight = UserInput.getDouble(); // UserInput class �� getDouble method ���
		System.out.print("Ű�� �Է����ּ���(cm): ");
		this.height = UserInput.getDouble();
	}
	
}
