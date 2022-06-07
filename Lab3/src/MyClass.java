
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

	// 사용자에게 어떤 사칙 연산을 할것인지 입력을 받는 method
	public void getUserInput() {
		System.out.print("하고 싶은 계산의 숫자를 입력하세요(더하기 1, 빼기 2, 곱하기 3, 나누기 4): ");
		this.i = UserInput.getIntegerBetween(1, 4);
		System.out.print("x값을 입력하세요(실수) : ");
		this.x = UserInput.getDouble();
		System.out.print("y값을 입력하세요(실수) : ");
		this.y = UserInput.getDouble();
	}
	
	// i 값에 따라서 다른 사칙연산 값 result에 저장
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
