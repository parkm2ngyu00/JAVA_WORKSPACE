
public class MyClass {
	
	int i;
	double x;
	double y;
	
	// 사용자에게 어떤 사칙 연산을 할것인지 입력을 받는 method
	public void getUserInput() {
		System.out.print("하고 싶은 사칙 연산을 입력하세요(더하기 1, 빼기 2, 곱하기 3, 나누기 4): ");
		this.i = UserInput.getIntegerBetween(1, 4);
		System.out.print("x값을 입력하세요 : ");
		this.x = UserInput.getDouble();
		System.out.print("y값을 입력하세요 : ");
		this.y = UserInput.getDouble();
	}
	
	// i 값에 따라서 다른 사칙연산 값 반환하는 method
	public double calculte() {
		switch(i) {
		case 1:
			return this.x + this.y;
		case 2:
			return this.x - this.y;
		case 3:
			return this.x * this.y;
		case 4:
			return this.x / this.y;
		}
		return 0;
	}
	
}
