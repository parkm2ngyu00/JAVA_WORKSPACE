import java.util.Scanner;

public class UserInput {
	static Scanner scan = new Scanner(System.in);
	
	public static double getDouble() {
		return Double.parseDouble(scan.nextLine());
	}
	
	public static int getInteger() {
		return Integer.parseInt(scan.nextLine());
	}
	
	// min, max 사이에 있는 숫자가 아니라면 오류 발생
	public static int getIntegerBetween(int min, int max) {
		int value = 0;
		do {
			try {
				value = Integer.parseInt(scan.nextLine());
			}
			catch (Exception e) {
				System.out.printf("Error! Please re-enter value [%d-%d]:\n", min, max);
				continue;
			}
		} while (value < min || value > max);
		return value;
	}
	
	// q 키를 누르면 true 반환, enter 키 누르면 false 반환
	public static boolean getExitKey() {
		System.out.print("Press q-key to exit or enter-key to continue: ");
		String s = scan.nextLine();
		if (s.contentEquals("q") ) {
			return true;
		} else {
			return false;
		}
	}
}
