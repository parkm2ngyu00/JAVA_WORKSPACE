
public class MyClass {
	
	int i;
	double x;
	double y;
	
	// ����ڿ��� � ��Ģ ������ �Ұ����� �Է��� �޴� method
	public void getUserInput() {
		System.out.print("�ϰ� ���� ��Ģ ������ �Է��ϼ���(���ϱ� 1, ���� 2, ���ϱ� 3, ������ 4): ");
		this.i = UserInput.getIntegerBetween(1, 4);
		System.out.print("x���� �Է��ϼ��� : ");
		this.x = UserInput.getDouble();
		System.out.print("y���� �Է��ϼ��� : ");
		this.y = UserInput.getDouble();
	}
	
	// i ���� ���� �ٸ� ��Ģ���� �� ��ȯ�ϴ� method
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
