
public class MyInheritanceClass extends MyClass {
	
	
	// i ���� ���� �ٸ� ��� �� result�� ����
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
			case 5:
				while (x != y) {
					if (x >= y) {
						x -= y;
					} else {
						y -= x;
					}
				}
				result = x;
				break;
			}
		}
	
		// ����ڿ��� � ����� �Ұ����� �Է��� �޴� method
		// 5.�ִ����� ���ϱ� ��� �߰�
		public void getUserInput() {
			System.out.print("�ϰ� ���� ����� ���ڸ� �Է��ϼ���(1.���ϱ�, 2.����, 3.���ϱ�, 4.������, 5.�ִ����� ���ϱ�): ");
			this.i = UserInput.getIntegerBetween(1, 5);
			if (i == 5) {
				System.out.print("x���� �Է��ϼ���(����) : ");
				this.x = UserInput.getInteger();
				System.out.print("y���� �Է��ϼ���(����) : ");
				this.y = UserInput.getInteger();
			} else {				
				System.out.print("x���� �Է��ϼ���(�Ǽ�) : ");
				this.x = UserInput.getDouble();
				System.out.print("y���� �Է��ϼ���(�Ǽ�) : ");
				this.y = UserInput.getDouble();
			}
		}
}
