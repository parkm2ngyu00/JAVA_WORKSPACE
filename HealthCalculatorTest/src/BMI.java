public enum BMI {
	UNDERWEIGHT, NORMAL, OVERWEIGHT, OBESE;

	public static BMI valueOf(int value) {
		switch(value) {
		case 0:	return UNDERWEIGHT;
		case 1:	return NORMAL;
		case 2:	return OVERWEIGHT;
		case 3:	return OBESE;
		default: return null;
		}
	}

	public static String[] names() {
		String[] names = new String[BMI.values().length];
		for (BMI t : BMI.values()) 
			names[t.ordinal()] = t.toString();
		return names;
	}
	
	// https://bmi-calories.com/bmi-calculator.html
	public static BMI getIndex(double value) {
		if (value >= 0.0 && value < 18.5) 
			return BMI.UNDERWEIGHT;
		else if (value >= 18.5 && value < 25.0) 
			return BMI.NORMAL;
		else if (value >= 25.0 && value < 30.0) 
			return BMI.OVERWEIGHT;
		else 
			return BMI.OBESE;
	}
}
