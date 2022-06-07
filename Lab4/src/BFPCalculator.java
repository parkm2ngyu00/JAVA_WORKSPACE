
public class BFPCalculator implements IHealthCalculator {
	Gender gender;
	double height;
	double weight;
	double neck;
	double waist;
	double hip;
	double BFP;
	
	// default constructor
	public BFPCalculator() {
		this.gender = null;
		this.height = 0;
		this.weight = 0;
		this.neck = 0;
		this.waist = 0;
		this.hip = 0;
	}
	
	// constructor
	public BFPCalculator(Gender gender, double height, double weight, double neck, double waist, double hip) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.neck = neck;
		this.waist = waist;
		this.hip = hip;
	}

	// getter & setter
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
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
	
	// calculate method
	// gender에 따라서 다른 공식 적용
	public double calculate() {
		if (this.gender == Gender.MALE) {
			BFP = 495 / (1.29579 - 0.35004 * Math.log10(this.waist - this.neck) + 0.22100 * Math.log10(this.height)) - 450;
		} else if (this.gender == Gender.FEMALE) {
			BFP = 495 / (1.29579 - 0.35004 * Math.log10(this.waist + this.hip - this.neck) + 0.22100 * Math.log10(this.height)) - 450;
		}
		return BFP;
	}
	
	// user input
	public void getUserInput() {
		int i;
		System.out.print("성별을 입력해 주세요(남자면 1, 여자면 2): ");
		i = UserInput.getIntegerBetween(1, 2);
		if (i == 1) {
			this.gender = Gender.MALE;
		} else {
			this.gender = Gender.FEMALE;
		}
		System.out.print("몸무게를 입력해주세요(kg): ");
		this.weight = UserInput.getDouble();
		System.out.print("키를 입력해주세요(cm): ");
		this.height = UserInput.getDouble();
		System.out.print("목 둘레를 입력해주세요(cm): ");
		this.neck = UserInput.getDouble();
		System.out.print("허리 둘레를 입력해주세요(cm): ");
		this.waist = UserInput.getDouble();
		System.out.print("엉덩이 둘레를 입력해주세요(cm): ");
		this.hip = UserInput.getDouble();
	}
	
	// setDataInput
	@Override
	public void setDataInput(PersonData person) {
		gender = person.gender();
		height = person.height();
		weight = person.weight();
		neck = person.neck();
		waist = person.waist();
		hip = person.hip();
	}
	
	// toString
	public String toString() {
		return "BFPCalculator [gender=" + gender + ", height=" + height + ", weight=" + weight + ", neck=" + neck
				+ ", waist=" + waist + ", hip=" + hip + ", BFP=" + BFP +"]";
	}
	
}
