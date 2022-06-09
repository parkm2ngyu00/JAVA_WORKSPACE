
public class HealthCalculatorFactory {
	// create
	public static IHealthCalculator getInstance(Mode mode) {
		switch(mode) {
		case BMI:
			return new BMICalculator();         
		case BFP:
			return new BFPCalculator();	 
		case BMR:
			return new BMRCalculator();	 
		case CI:
			return new CalorieIntakeCalculator();	 
		default:
			return null;
		}
	}

}
