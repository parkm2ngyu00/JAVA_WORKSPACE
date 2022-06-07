

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
	
	// value ���� low�� high ���̿� �ִ��� true, false�� ��ȯ���ش�.
	public boolean within(int value) {
        return value >= low && value <= high;
    }
	
	// ���� ������ ���� �������� index ��ȯ
	public static int indexOf(int value) {
		for (LengthGroup g : LengthGroup.values()) {
			if (g.within(value)) 
				return g.ordinal();
		}
		return -1;
	}
	
	// ������ data low, high �� ��ȯ
	public String getName() {
		return this.low + " - " + this.high;
	}
	
	// String array�� �� �������� getName �� �� ���� �� ��ȯ
	public static String[] names() {
		String[] names = new String[LengthGroup.values().length];
		for (LengthGroup g : LengthGroup.values()) 
			names[g.ordinal()] = g.getName();
		return names;
	}
}

