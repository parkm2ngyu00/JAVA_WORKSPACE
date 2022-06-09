import java.util.Scanner;

public class UserInput {
	private static Scanner input = new Scanner(System.in); 
	
	public static String getString() { 
		return input.nextLine(); 
	}
	
	public static int getInteger() { 
		int value = 0; 
		value = Integer.parseInt(input.nextLine()); //��������� ���� ���� ������ ��ȯ�Ͽ� value�� �����Ѵ�
		return value; 
	}

	public static int getIntegerBetween(int min, int max) { 
		int value = 0;
		do {
			try {
				value = Integer.parseInt(input.nextLine());
			}
			catch (Exception e) {
				System.out.printf("Error! Please re-enter value [%d-%d]:\n", min, max);
				continue;
			}
		} while (value < min || value > max);
		return value;
	}
	
	public static double getDouble() { 
		double value = 0.0; 
		value = Double.parseDouble(input.nextLine()); //����ڷκ��� ���� ���� double�� ��ȯ�Ͽ� �����Ѵ�
		return value; 
	}

	public static boolean getExitKey() { 
		System.out.print("Press q-key to exit or enter-key to continue: "); 
		String str = input.nextLine(); 
		if(str.contentEquals("q")) //���� str������ ���ڿ��� "q"���� ���ٸ� true ����
			return true; 
		else
			return false; //str������ ���ڿ��� "q"�� ���� ���� �ʴٸ� false ���� 
	}
	
	
}