import java.util.Scanner;

public class UserInput {
	static Scanner scan = new Scanner(System.in);
	
	public static double getDouble() {
		return Double.parseDouble(scan.nextLine());
	}
	
	public static int getInteger() {
		return Integer.parseInt(scan.nextLine());
	}
	
	// min, max ���̿� �ִ� ���ڰ� �ƴ϶�� ���� �߻�
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
	
	// q Ű�� ������ true ��ȯ, enter Ű ������ false ��ȯ
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
