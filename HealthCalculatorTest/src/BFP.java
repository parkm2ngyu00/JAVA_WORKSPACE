public enum BFP {
	ESSENTIAL_FAT, ATHLETES, FITNESS, AVERAGE, OBESE;

	public static BFP valueOf(int value) {
		switch(value) {
		case 0:	return ESSENTIAL_FAT;
		case 1:	return ATHLETES;
		case 2:	return FITNESS;
		case 3:	return AVERAGE;
		case 4: return OBESE;
		default: return null;
		}
	}

	public static BFP getIndex(Gender gender, double value) {
        if (gender == Gender.MALE) {
            if (value < 5.5)
                return BFP.ESSENTIAL_FAT;
            else if (value >= 5.5 && value < 13.5)
                return BFP.ATHLETES;
            else if (value >= 13.5 && value < 17.5)
                return BFP.FITNESS;
            else if (value >= 17.5 && value < 24.5)
                return BFP.AVERAGE;
            else
                return BFP.OBESE;
        }
        else {
            if (value < 13.5)
                return BFP.ESSENTIAL_FAT;
            else if (value >= 13.5 && value < 20.5)
                return BFP.ATHLETES;
            else if (value >= 20.5 && value < 24.5)
                return BFP.FITNESS;
            else if (value >= 24.5 && value < 31.5)
                return BFP.AVERAGE;
            else
                return BFP.OBESE;
        }    
    }
	
	public static String[] names() {
		String[] names = new String[BFP.values().length];
		for (BFP t : BFP.values()) 
			names[t.ordinal()] = t.toString();
		return names;
	}
}
