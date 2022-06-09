//Enum: BMI
public enum Gender {
	FEMALE(0), MALE(1);
	
	private final int type;
	Gender(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}

	public static Gender valueOf(int value) {
		switch (value) { // switch
		case 0:
			return FEMALE;
		case 1:
			return MALE;
		}
		return null;
	}
}
