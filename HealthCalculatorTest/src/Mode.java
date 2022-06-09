
public enum Mode {
	BMI,
	BFP,
	BMR,
	CI;
	
	public static Mode valueOf(int value) {
		switch (value) { // switch
		case 0:
			return BMI;
		case 1:
			return BFP;
		case 2:
			return BMR;			
		case 3:
			return CI;			
		}
		return null;
	}
	
	public static String[] names() {
		String[] names = new String[Mode.values().length];
		for (Mode m : Mode.values()) 
			names[m.ordinal()] = m.toString();
		return names;
	}
}
