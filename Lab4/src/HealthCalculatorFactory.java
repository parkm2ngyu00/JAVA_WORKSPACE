
public class HealthCalculatorFactory {
	
	public static IHealthCalculator getInstance(Mode mode) {
		switch(mode) {
			case BMI:
				BMICalculator BMI = new BMICalculator();
				return BMI;
			case BFP:
				BFPCalculator BFP = new BFPCalculator();
				return BFP;
			case BMR:
				BMRCalculator BMR = new BMRCalculator();
				return BMR;
			case CI:
				CalorieIntakeCalculator CI = new CalorieIntakeCalculator();
				return CI;
		}
		return null;
	}
	
}
