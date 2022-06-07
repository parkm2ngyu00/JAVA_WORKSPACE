

public enum LengthGroup {
	L0_TO_1(0,1),
	L2_TO_3(2,3),
	L4_TO_6(4,6),
	L7_TO_9(7,9),
	L10_TO_15(10, 15);
	
	private final int low;
	private final int high;
	
	LengthGroup(int low, int high) {
		this.low = low;
		this.high = high;
	}
	
	// value 값이 low와 high 사이에 있는지 true, false를 반환해준다.
	public boolean within(int value) {
        return value >= low && value <= high;
    }
	
	// 숫자 범위에 따라 열거형의 index 반환
	public static int indexOf(int value) {
		for (LengthGroup g : LengthGroup.values()) {
			if (g.within(value)) 
				return g.ordinal();
		}
		return -1;
	}
	
	// 열거형 data low, high 값 반환
	public String getName() {
		return this.low + " - " + this.high;
	}
	
	// String array에 각 열거형에 getName 한 값 저장 후 반환
	public static String[] names() {
		String[] names = new String[LengthGroup.values().length];
		for (LengthGroup g : LengthGroup.values()) 
			names[g.ordinal()] = g.getName();
		return names;
	}
}

