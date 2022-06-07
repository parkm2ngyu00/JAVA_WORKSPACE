
public class MyInheritanceClass extends MyClass {
	
	
	// i 값에 따라서 다른 계산 값 result에 저장
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
	
		// 사용자에게 어떤 계산을 할것인지 입력을 받는 method
		// 5.최대공약수 구하기 계산 추가
		public void getUserInput() {
			System.out.print("하고 싶은 계산의 숫자를 입력하세요(1.더하기, 2.빼기, 3.곱하기, 4.나누기, 5.최대공약수 구하기): ");
			this.i = UserInput.getIntegerBetween(1, 5);
			if (i == 5) {
				System.out.print("x값을 입력하세요(정수) : ");
				this.x = UserInput.getInteger();
				System.out.print("y값을 입력하세요(정수) : ");
				this.y = UserInput.getInteger();
			} else {				
				System.out.print("x값을 입력하세요(실수) : ");
				this.x = UserInput.getDouble();
				System.out.print("y값을 입력하세요(실수) : ");
				this.y = UserInput.getDouble();
			}
		}
}
