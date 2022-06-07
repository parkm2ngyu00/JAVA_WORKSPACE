
public class MyClass {
	int i;
	double x;
	double y;
	double result;
	
	// default constructor
	public MyClass() {
		this(0, 0, 0);
	}
	
	// constructor
	public MyClass(int i, double x, double y) {
		super();
		this.i = i;
		this.x = x;
		this.y = y;
	}
	
	// getter & setter
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// ����ڿ��� � ��Ģ ������ �Ұ����� �Է��� �޴� method
	public void getUserInput() {
		System.out.print("�ϰ� ���� ����� ���ڸ� �Է��ϼ���(���ϱ� 1, ���� 2, ���ϱ� 3, ������ 4): ");
		this.i = UserInput.getIntegerBetween(1, 4);
		System.out.print("x���� �Է��ϼ���(�Ǽ�) : ");
		this.x = UserInput.getDouble();
		System.out.print("y���� �Է��ϼ���(�Ǽ�) : ");
		this.y = UserInput.getDouble();
	}
	
	// i ���� ���� �ٸ� ��Ģ���� �� result�� ����
	public void calculte() {
		switch(i) {
		case 1:
			result = this.x + this.y;
			break;
		case 2:
			result = this.x - this.y;
			break;
		case 3:
			result = this.x * this.y;
			break;
		case 4:
			result = this.x / this.y;
			break;
		}
	}

	// toString
	@Override
	public String toString() {
		return "[result = " + result + "]";
	}
}
