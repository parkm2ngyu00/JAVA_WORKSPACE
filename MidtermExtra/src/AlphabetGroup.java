

public enum AlphabetGroup {
	A_TO_E("'a'-'e'"),
	F_TO_J("'f'-'j'"),
	K_TO_O("'k'-'o'"),
	P_TO_T("'p'-'t'"),
	U_TO_Y("'u'-'y'");
	
	private final String name;
	
	// constructor
	AlphabetGroup(String name) {
		this.name = name;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	// alphabet ������ ���� ������ data�� index�� ��ȯ
	public static int indexOf(char ch) {
		if (ch >= 'a' && ch <= 'e') {
			return A_TO_E.ordinal();
		} else if (ch >= 'f' && ch <= 'j') {
			return F_TO_J.ordinal();
		} else if (ch >= 'k' && ch <= 'o') {
			return K_TO_O.ordinal();			
		} else if (ch >= 'p' && ch <= 't') {
			return P_TO_T.ordinal();			
		} else if (ch >= 'u' && ch <= 'y') {
			return U_TO_Y.ordinal();			
		} else {
			return -1;
		}
	}
	
	// String array�� �� ������ name ���� �� ��ȯ 
	public static String[] names() {
		String[] names = new String[AlphabetGroup.values().length];
		for (AlphabetGroup g : AlphabetGroup.values()) 
			names[g.ordinal()] = g.getName();
		return names;
	}
}

