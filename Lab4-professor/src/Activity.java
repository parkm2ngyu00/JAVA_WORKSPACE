public enum Activity {
	SEDENTARY, LIGHTLY_ACTIVE, MODERATELY_ACTIVE, VERY_ACTIVE, EXTRA_ACTIVE;

	public static Activity valueOf(int value) {
		switch(value) {
		case 0:
			return SEDENTARY;
		case 1:
			return LIGHTLY_ACTIVE;
		case 2:
			return MODERATELY_ACTIVE;
		case 3:
			return VERY_ACTIVE;
		case 4:
			return EXTRA_ACTIVE;
		default:
			return null;
		}
	}

	public static String[] names() {
		String[] names = new String[Activity.values().length];
		for (Activity t : Activity.values()) 
			names[t.ordinal()] = t.toString();
		return names;
	}
}