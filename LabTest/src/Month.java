
public enum Month {
	JAN(1, "janurary"), 
	FEB(2, "feburary"), 
	MAR(3, "march"), 
	APR(4, "april"),
	MAY(5, "may"), 
	JUN(6, "june"), 
	JUL(7, "july"), 
	AUG(8, "august"), 
	SEP(9, "september"), 
	OCT(10, "october"), 
	NOV(11, "november"), 
	DEC(12,"december");
	int month;
	String monthName;
	Month(int month, String monthName) {
		this.month = month;
		this.monthName = monthName;
	}
	int getMonth() {
		return this.month;
	}
	String getName() {
		return this.monthName;
	}
}