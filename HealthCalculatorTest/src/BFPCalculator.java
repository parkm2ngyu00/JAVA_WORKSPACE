public class BFPCalculator implements IHealthCalculator {
	// member field
	Gender gender;
	double height;
	double neck;
	double waist;
	double hip;
	
 	// constructor
	public BFPCalculator() {
		this(null, 0.0, 0.0, 0.0, 0.0);
	}
		
	public BFPCalculator(Gender gender, double height, double neck, double waist, double hip) {
		super();
		this.gender = gender;
		this.height = height;
		this.neck = neck;
		this.waist = waist;
		this.hip = hip;
	}

	// getter/setter	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getNeck() {
		return neck;
	}

	public void setNeck(double neck) {
		this.neck = neck;
	}

	public double getWaist() {
		return waist;
	}

	public void setWaist(double waist) {
		this.waist = waist;
	}

	public double getHip() {
		return hip;
	}

	public void setHip(double hip) {
		this.hip = hip;
	}

	@Override
	public String toString() {
		return "BFPCalculator [gender=" + gender + ", height=" + height + ", neck=" + neck + ", waist=" + waist
				+ ", hip=" + hip + ", calculate()=" + calculate() + ", BFP=" + BFP.getIndex(gender,calculate()) + "]";
	}

	// https://bmi-calories.com/body-fat-percentage-calculator.html
    // Men: BFP = 495 / (1.29579 - .35004 * log10(Waist - Neck) + 0.22100 * log10(Height)) - 450
    // Women: BFP = 495 / (1.29579 - .35004 * log10(Waist + Hip - Neck) + 0.22100 * log10(Height)) - 450
 	/*public double calculate() {
		if (this.gender == Gender.MALE)
			return 495 / (1.29579 - .35004 * Math.log10(waist - neck) + 0.22100 * Math.log10(height)) - 450.0;
		else
			return 495 / (1.29579 - .35004 * Math.log10(waist + hip - neck) + 0.22100 * Math.log10(height)) - 450.0;
	}*/
 	
 	// https://www.healthline.com/health/how-to-measure-body-fat#body-circumference
	public double calculate() {
		if (gender == Gender.MALE)
			return 86.010 * Math.log10(waist - neck) - 70.041 * Math.log10(height) + 36.76;
		else
			return 163.205 * Math.log10(waist + hip - neck) - 97.684 * Math.log10(height) - 78.387;
	}
 	
	@Override
	public void getUserInput() {
		System.out.println("~~~~~Body Fat Percentage Calculator~~~~~");	
		System.out.print("Please enter gender [FEMALE, MALE]: ");
		gender = Gender.valueOf(UserInput.getString());
		System.out.print("Please enter height (cm): ");
		height = UserInput.getDouble();
		System.out.print("Please enter neck (cm): ");
		neck = UserInput.getDouble();
		System.out.print("Please enter waist (cm): ");
		waist = UserInput.getDouble();
		System.out.print("Please enter hip (cm): ");
		hip = UserInput.getDouble();
	}
	
	@Override
	public void setDataInput(PersonData person) {
		gender = person.gender();
		height = person.height();		
		neck = person.neck();
		waist = person.waist();
		hip = person.hip();
	}
}
