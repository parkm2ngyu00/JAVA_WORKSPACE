/*
과제 : Lab2
분반 : 3분반
학번 : 32191597
이름 : 박민규
날짜 : 2022-04-01
*/

public class Lab2 {
	
	// calculateBMI method
	public static double calculateBMI(double weight, double height) {
		return weight / (height * 0.01) / (height * 0.01);
	}
	
	// calculateBFP method
	public static double calculateBFP(Gender gender, double weight, double height, double neck, double waist, double hip) {
		if (gender == Gender.MALE) {
			return 86.010 * Math.log10(waist - neck) - 70.041 * Math.log10(height) + 36.76;
		} else {
			return 163.205 * Math.log10(waist + hip - neck) - 97.684 * Math.log10(height) - 78.387;
		}
	}
	public static void main(String[] args) {
		
		// main 에서 데이터 넣어주고 BMI, BFP 를 method를 이용하여 출력하는 코드
		double[] BMI = {calculateBMI(64, 174), calculateBMI(88, 190), calculateBMI(50, 177)};
		double[] BFP = {calculateBFP(Gender.MALE, 64, 174, 30, 75, 90), calculateBFP(Gender.FEMALE, 50, 163, 25, 60, 80)};
		for (double bmi : BMI) {
			System.out.println("BMI : " + bmi);
		}
		for (double bfp : BFP) {
			System.out.println("BFP : " + bfp);
		}
		
		// class 를 이용하여 BMI, BFP를 계산한 값을 출력하는 코드
		do {
			System.out.print("BMI를 계산하려면 1번을, BFP를 계산하려면 2를 눌러주세요 : ");
			int value = UserInput.getIntegerBetween(1, 2);
			if (value == 1) {
				BMICalculator myBMI = new BMICalculator();
				myBMI.getUserInput();
				myBMI.calculate();
				System.out.println(myBMI);
			} else if (value == 2) {
				BFPCalculator myBFP = new BFPCalculator();
				myBFP.getUserInput();
				myBFP.calculate();
				System.out.println(myBFP);
			}
		} while (UserInput.getExitKey() == false); // enter를 누르는 동안 반복, q를 누르면 탈출

		// myClass
		MyClass my = new MyClass();
		my.getUserInput();
		double res;
		res = my.calculte();
		System.out.println("result : " + res);
		
	}
}
