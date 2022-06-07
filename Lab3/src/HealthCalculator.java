// 추상 클래스 (객체 생성이 아닌 상속을 위해 사용되는 클래스)
public abstract class HealthCalculator {
	// 추상 method
	// 하위 클래스에 반드시 재정의 해야한다.
	public abstract double calculate();
	public abstract void getUserInput();
}
