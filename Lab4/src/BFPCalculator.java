
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
	// gender�� ���� �ٸ� ���� ����
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
		System.out.print("������ �Է��� �ּ���(���ڸ� 1, ���ڸ� 2): ");
		i = UserInput.getIntegerBetween(1, 2);
		if (i == 1) {
			this.gender = Gender.MALE;
		} else {
			this.gender = Gender.FEMALE;
		}
		System.out.print("�����Ը� �Է����ּ���(kg): ");
		this.weight = UserInput.getDouble();
		System.out.print("Ű�� �Է����ּ���(cm): ");
		this.height = UserInput.getDouble();
		System.out.print("�� �ѷ��� �Է����ּ���(cm): ");
		this.neck = UserInput.getDouble();
		System.out.print("�㸮 �ѷ��� �Է����ּ���(cm): ");
		this.waist = UserInput.getDouble();
		System.out.print("������ �ѷ��� �Է����ּ���(cm): ");
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
